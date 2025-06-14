package app.travelplannerapp.api;

import app.travelplanner.api.TripsApi;
import app.travelplanner.model.Trip;
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
    public ResponseEntity<List<Trip>> addTrip(Trip trip) {
        return null;
    }

    @Override
    public ResponseEntity<List<Trip>> getAllTrips() {
        return ResponseEntity.ok(List.of(new Trip("MyTrip", LocalDate.now(), LocalDate.now())));
    }

    @Override
    public ResponseEntity<Trip> getTripById(UUID tripId) {
        return null;
    }
}