package Student_Bus.Student_Busm.service;

import Student_Bus.Student_Busm.entity.Bus;
import Student_Bus.Student_Busm.entity.BusAssignment;
import Student_Bus.Student_Busm.entity.BusStatus;
import Student_Bus.Student_Busm.repository.BusAssignmentRepository;
import Student_Bus.Student_Busm.repository.BusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BusAssignmentService {

    private final BusAssignmentRepository busAssignmentRepository;
    private final BusRepository busRepository;

    @Transactional
    public List<BusAssignment> saveAll(List<BusAssignment> assignments) {
        for (BusAssignment assignment : assignments) {
            setBusActive(assignment.getBus().getId());
        }
        return busAssignmentRepository.saveAll(assignments);
    }

    @Transactional
    public BusAssignment save(BusAssignment assignment) {
        setBusActive(assignment.getBus().getId());
        return busAssignmentRepository.save(assignment);
    }

    private void setBusActive(Long busId) {
        Bus bus = busRepository.findById(busId)
                .orElseThrow(() -> new RuntimeException("Bus not found with ID: " + busId));
        bus.setBusStatus(BusStatus.ACTIVE);
        busRepository.save(bus);
    }

    public List<BusAssignment> findAll() {
        return busAssignmentRepository.findAll();
    }
}
