package Student_Bus.Student_Busm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Student_Bus.Student_Busm.entity.Driver;

import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findByDriverIdAndPassword(String driverId, String password);
}
