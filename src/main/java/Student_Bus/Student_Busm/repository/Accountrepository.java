package Student_Bus.Student_Busm.repository;

import Student_Bus.Student_Busm.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Accountrepository extends JpaRepository<Account,Long> {
    Optional<Account> findByStudentIdAndPassword(String studentId, String password);

}
