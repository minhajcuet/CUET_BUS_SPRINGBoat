package Student_Bus.Student_Busm.service;

import Student_Bus.Student_Busm.entity.BusStopage;
import Student_Bus.Student_Busm.repository.BusStopageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BusStopageService {

    private final BusStopageRepository busStopageRepository;

    // Create a new bus stopage
    public BusStopage createBusStopage(BusStopage busStopage) {
        return busStopageRepository.save(busStopage); // Save and return the created stopage
    }

    // Get all bus stopages
    public List<BusStopage> getAllStopages() {
        return busStopageRepository.findAll(); // Fetch all stopages from the repository
    }
}
