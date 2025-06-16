package app.travelplannerapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.util.UUID;

@Entity
public class Trip {

    @Id
    private UUID id;
    private String title;
}
