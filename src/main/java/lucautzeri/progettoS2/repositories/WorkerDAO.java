package lucautzeri.progettoS2.repositories;

import lucautzeri.progettoS2.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkerDAO extends JpaRepository<Worker, UUID> {
}
