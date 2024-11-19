package Student_Bus.Student_Busm.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class BusAssignment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "bus_id", nullable = false)
    private Bus bus;

    @ManyToOne
    @JoinColumn(name = "driver_id", nullable = false)
    private Driver driver;

    private String route;
    private String schedule;

    // Additional fields as needed
}
