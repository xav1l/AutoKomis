package pl.pawelsuska.AutoKomis.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelsuska.AutoKomis.model.Operation;

public interface OperationRepository extends JpaRepository<Operation,Integer> {
}
