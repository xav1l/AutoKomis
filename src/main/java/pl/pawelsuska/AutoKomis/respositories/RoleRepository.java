package pl.pawelsuska.AutoKomis.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelsuska.AutoKomis.model.Role;

public interface RoleRepository extends JpaRepository<Role,Integer> {
}
