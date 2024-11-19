package Student_Bus.Student_Busm.repository;

import Student_Bus.Student_Busm.entity.BusAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusAssignmentRepository extends JpaRepository<BusAssignment, Long> {
}
