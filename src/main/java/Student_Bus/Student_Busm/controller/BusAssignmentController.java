package Student_Bus.Student_Busm.controller;

import Student_Bus.Student_Busm.entity.BusAssignment;
import Student_Bus.Student_Busm.service.BusAssignmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/assignments")
@RequiredArgsConstructor
@CrossOrigin("*")
public class BusAssignmentController {

    private final BusAssignmentService busAssignmentService;

    // Endpoint to create multiple bus assignments
    @PostMapping
    public List<BusAssignment> createAssignments(@RequestBody List<BusAssignment> assignments) {
        return busAssignmentService.saveAll(assignments);
    }

    // Endpoint to get all bus assignments
    @GetMapping
    public List<BusAssignment> getAllAssignments() {
        return busAssignmentService.findAll();
    }

    // Endpoint to create a single bus assignment
    @PostMapping("/create")
    public BusAssignment createAssignment(@RequestBody BusAssignment assignment) {
        return busAssignmentService.save(assignment);
    }
}
