// BusService.java
package Student_Bus.Student_Busm.service;

import Student_Bus.Student_Busm.entity.Bus;
import Student_Bus.Student_Busm.entity.BusStatus;
import Student_Bus.Student_Busm.entity.Direction;
import Student_Bus.Student_Busm.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    // Method to add a new bus
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    // Method to retrieve all active buses
    public List<Bus> getActiveBuses() {
        return busRepository.findByBusStatus(BusStatus.ACTIVE);
    }

    // Method to find a bus by ID
    public Optional<Bus> getBusById(Long id) {
        return busRepository.findById(id);
    }

    // Method to update the bus status
    public Bus updateBusStatus(Long id, BusStatus status) {
        Bus bus = busRepository.findById(id).orElseThrow(() -> new RuntimeException("Bus not found"));
        bus.setBusStatus(status);
        return busRepository.save(bus);
    }

    // Method to update the direction of a bus
    public Bus updateBusDirection(Long id, String direction) {
        Bus bus = busRepository.findById(id).orElseThrow(() -> new RuntimeException("Bus not found"));
        bus.setDirection(Direction.valueOf(direction.toUpperCase()));
        return busRepository.save(bus);
    }
}
