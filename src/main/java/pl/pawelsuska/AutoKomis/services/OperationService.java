package pl.pawelsuska.AutoKomis.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.pawelsuska.AutoKomis.model.Operation;
import pl.pawelsuska.AutoKomis.respositories.OperationRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OperationService {

    private final OperationRepository operationRepository;

    @Autowired
    public OperationService(OperationRepository operationRepository) {
        this.operationRepository = operationRepository;
    }

    public List<Operation> findAll() {
        return operationRepository.findAll();
    }

    public Optional<Operation> findById(Integer id) {
        return operationRepository.findById(id);
    }

    public void save(Operation customer) {
        operationRepository.save(customer);
    }

    public void deleteById(Integer id) {
        operationRepository.deleteById(id);
    }

    public Operation update(Operation operation) {
        return operationRepository.findAll().stream()
                .filter(c -> c.getId().equals(operation.getId()))
                .findFirst()
                .orElse(operation);
    }
}