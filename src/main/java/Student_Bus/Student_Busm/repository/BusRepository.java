// BusRepository.java
package Student_Bus.Student_Busm.repository;

import Student_Bus.Student_Busm.entity.Bus;
import Student_Bus.Student_Busm.entity.BusStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    List<Bus> findByBusStatus(BusStatus status);  // Find all buses by status (e.g., only active buses)
}
