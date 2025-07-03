package app.travelplannerapp.service;

import app.travelplannerapp.model.Trip;
import app.travelplannerapp.repository.TripRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public void saveTrip(Trip trip) {
        tripRepository.save(trip);
    }

    public List<Trip> getAllTrips() {
        return (List<Trip>) tripRepository.findAll();
    }
}