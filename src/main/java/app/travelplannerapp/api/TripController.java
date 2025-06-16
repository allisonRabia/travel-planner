package app.travelplannerapp.api;

import app.travelplanner.api.TripsApi;
import app.travelplanner.model.TripDTO;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TripController implements TripsApi {

    @Override
    public ResponseEntity<List<TripDTO>> addTrip(TripDTO trip) {
        return null;
    }

    @Override
    public ResponseEntity<List<TripDTO>> getAllTrips() {
        return ResponseEntity.ok(List.of(new TripDTO("MyTrip", LocalDate.now(), LocalDate.now())));
    }

    @Override
    public ResponseEntity<TripDTO> getTripById(UUID tripId) {
        return null;
    }
}