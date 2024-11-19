// BusController.java
package Student_Bus.Student_Busm.controller;

import Student_Bus.Student_Busm.entity.Bus;
import Student_Bus.Student_Busm.entity.BusStatus;
import Student_Bus.Student_Busm.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/buses")
@CrossOrigin("*")
public class BusController {

    @Autowired
    private BusService busService;

    // Endpoint to add a new bus
    @PostMapping
    public Bus addBus(@RequestBody Bus bus) {
        return busService.addBus(bus);
    }

    // Endpoint to get all buses
    @GetMapping  // This allows GET requests to /api/buses
    public List<Bus> getAllBuses() {
        return busService.getActiveBuses(); // Adjust this method if needed
    }

    // Endpoint to get only active buses
    @GetMapping("/active")
    public List<Bus> getActiveBuses() {
        return busService.getActiveBuses();
    }

    // Endpoint to get a bus by ID
    @GetMapping("/{id}")
    public Bus getBusById(@PathVariable Long id) {
        return busService.getBusById(id).orElseThrow(() -> new RuntimeException("Bus not found"));
    }

    // Endpoint to update bus status
    @PutMapping("/{id}/status")
    public Bus updateBusStatus(@PathVariable Long id, @RequestParam BusStatus status) {
        return busService.updateBusStatus(id, status);
    }

    // Endpoint to update bus direction
    @PutMapping("/{id}/direction")
    public Bus updateBusDirection(@PathVariable Long id, @RequestParam String direction) {
        return busService.updateBusDirection(id, direction);
    }
}
