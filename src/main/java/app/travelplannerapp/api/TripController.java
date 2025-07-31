package app.travelplannerapp.api;

import app.travelplanner.api.TripsApi;
import app.travelplanner.model.TripDTO;
import app.travelplannerapp.model.Trip;
import app.travelplannerapp.service.TripService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TripController implements TripsApi {

    @Autowired
    private TripService tripService;

    @Override
    public ResponseEntity<List<TripDTO>> addTrip(TripDTO tripDTO) {
        Trip convertedToModel = toModel(tripDTO);
        tripService.saveTrip(convertedToModel);
        List<Trip> retrievedTrips = tripService.getAllTrips();
        return ResponseEntity.ok(convertListDTO(retrievedTrips));
    }

    @Override
    public ResponseEntity<List<TripDTO>> getAllTrips() {
        List<Trip> retrievedTrips = tripService.getAllTrips();
        return ResponseEntity.ok(convertListDTO(retrievedTrips));
    }

    @Override
    public ResponseEntity<TripDTO> getTripById(UUID tripId) {
        Trip tripById = tripService.findTripById(tripId);
        return ResponseEntity.ok(toDTO(tripById));
    }

    private Trip toModel(TripDTO dto){
        Trip trip = new Trip();
        trip.setId(dto.getId());
        trip.setTitle(dto.getTitle());
        trip.setStartDate(dto.getStartDate());
        trip.setEndDate(dto.getEndDate());
        return trip;
    }

    private TripDTO toDTO(Trip model){
        TripDTO trip = new TripDTO();
        trip.setId(model.getId());
        trip.setTitle(model.getTitle());
        trip.setStartDate(model.getStartDate());
        trip.setEndDate(model.getEndDate());
        return trip;
    }

    private List<TripDTO> convertListDTO(List<Trip> listTrips){
        List<TripDTO> tripDTOS = new ArrayList<>();
        for(Trip trip : listTrips){
            tripDTOS.add(toDTO(trip));
        }
        return tripDTOS;
    }
}