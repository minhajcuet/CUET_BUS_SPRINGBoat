package Student_Bus.Student_Busm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bus_stopages")
public class BusStopage {

    @EmbeddedId  // Use the embedded composite key
    private BusStopageId busStopageId;  // This will act as the composite primary key


    @Column(name = "stop_order", nullable = false)
    private int stopOrder;  // Order of the stopage along the route

}
