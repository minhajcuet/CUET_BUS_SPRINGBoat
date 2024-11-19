package Student_Bus.Student_Busm.service;

import Student_Bus.Student_Busm.entity.Account;
import Student_Bus.Student_Busm.repository.Accountrepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Accountservice {

    private final Accountrepository accountrepository;

    public Account postaccount(Account account) {
        return accountrepository.save(account);
    }

    public Account findByStudentIdAndPassword(String studentId, String password) {
        Optional<Account> optionalAccount = accountrepository.findByStudentIdAndPassword(studentId, password);
        return optionalAccount.orElse(null);  // Return null if no account is found
    }
}
