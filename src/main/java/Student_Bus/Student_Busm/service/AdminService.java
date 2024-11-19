package Student_Bus.Student_Busm.service;

import Student_Bus.Student_Busm.entity.Admin;
import Student_Bus.Student_Busm.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepository adminRepository;

    public Admin registerAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin login(String adminId, String password) {
        Optional<Admin> optionalAdmin = adminRepository.findByAdminIdAndPassword(adminId, password);

        if (optionalAdmin.isPresent()) {
            System.out.println("Admin found: " + optionalAdmin.get().getAdminId());
        } else {
            System.out.println("No admin found with given credentials");
        }

        return optionalAdmin.orElse(null);  // Return null if no admin is found
    }

}
