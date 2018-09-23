package pl.pawelsuska.AutoKomis.respositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pawelsuska.AutoKomis.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
