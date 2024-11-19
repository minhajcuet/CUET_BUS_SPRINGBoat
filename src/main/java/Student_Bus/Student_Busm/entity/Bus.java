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

@Table(name = "buses")
@Entity

public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String code;

    @Column(nullable = false)
    private int totalSeats = 50;

    @Column(nullable = false)
    private int occupiedSeats = 0;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private BusStatus busStatus = BusStatus.ACTIVE;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Direction direction = Direction.FROM_CUET;


}
