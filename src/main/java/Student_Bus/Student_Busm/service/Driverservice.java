package Student_Bus.Student_Busm.service;

import Student_Bus.Student_Busm.entity.Driver;
import Student_Bus.Student_Busm.repository.DriverRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Driverservice {

    private final DriverRepository driverRepository;

    public Driver postdriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver findByDriverIdAndPassword(String driverId, String password) {
        Optional<Driver> optionalDriver = driverRepository.findByDriverIdAndPassword(driverId, password);

        if (optionalDriver.isPresent()) {
            System.out.println("Driver found: " + optionalDriver.get().getDriverId());
        } else {
            System.out.println("No driver found with given credentials");
        }

        return optionalDriver.orElse(null);  // Return null if no driver is found
    }

}

