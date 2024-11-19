package Student_Bus.Student_Busm.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


@Table(name = "drivers")
@Entity

public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String driverId;          // Unique driver identifier
    private String name;               // Driver's full name
    private String contactNo;        // Contact number
    private String email;            // Email address
    private String password;
}
