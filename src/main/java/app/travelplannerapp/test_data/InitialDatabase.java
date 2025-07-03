package app.travelplannerapp.test_data;

import app.travelplannerapp.model.Trip;
import app.travelplannerapp.service.TripService;
import jakarta.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitialDatabase {

    @Autowired
    private TripService tripService;

    @PostConstruct
    public void initializeDatabase(){
        UUID id = UUID.randomUUID();
        Trip trip = new Trip(id, "Some trip", LocalDate.now(), LocalDate.now());
        tripService.saveTrip(trip);
    }
}
