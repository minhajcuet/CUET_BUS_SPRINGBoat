package Student_Bus.Student_Busm.controller;

import Student_Bus.Student_Busm.entity.BusStopage;
import Student_Bus.Student_Busm.service.BusStopageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bus-stopages")
@RequiredArgsConstructor
@CrossOrigin("*")
public class BusStopageController {

    private final BusStopageService busStopageService;

    // Endpoint to create a new bus stopage
    @PostMapping("/create")
    public BusStopage createBusStopage(@RequestBody BusStopage busStopage) {
        return busStopageService.createBusStopage(busStopage); // Call the service method to create a stopage
    }

    // Endpoint to get all bus stopages
    @GetMapping
    public List<BusStopage> getAllStopages() {
        return busStopageService.getAllStopages(); // Call service to get all bus stopages
    }
}
