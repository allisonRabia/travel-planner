package app.travelplannerapp.repository;

import app.travelplanner.model.TripDTO;
import app.travelplannerapp.model.Trip;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends CrudRepository<Trip, UUID> {

}