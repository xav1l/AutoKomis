package pl.pawelsuska.AutoKomis.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelsuska.AutoKomis.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByLogin(String login);
}
