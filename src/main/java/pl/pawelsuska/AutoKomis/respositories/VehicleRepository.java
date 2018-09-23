package pl.pawelsuska.AutoKomis.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelsuska.AutoKomis.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {
}
