package Student_Bus.Student_Busm.controller;

import Student_Bus.Student_Busm.entity.Driver;
import Student_Bus.Student_Busm.service.Driverservice;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/drivers")
@RequiredArgsConstructor
@CrossOrigin("*")

public class DriverController {

    private final Driverservice driverService;

    @PostMapping("/register")
    public Driver createDriver(@RequestBody Driver driver) {
        return driverService.postdriver(driver);
    }

    @PostMapping("/login")
    public Driver login(@RequestBody Driver loginData) {
        Driver driver = driverService.findByDriverIdAndPassword(loginData.getDriverId(), loginData.getPassword());
        if (driver != null) {
            return driver;
        } else {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
        }
    }
}