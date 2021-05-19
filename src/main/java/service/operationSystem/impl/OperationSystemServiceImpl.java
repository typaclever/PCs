package service.operationSystem.impl;

import lombok.Data;
import lombok.NonNull;
import model.computer.Computer;
import model.operationSystem.OperationSystem;
import repository.operationSystem.OperationSystemRepository;
import service.operationSystem.OperationSystemService;

import java.util.List;

@Data
public class OperationSystemServiceImpl implements OperationSystemService {
    @NonNull
    private OperationSystemRepository operationSystemRepository;

    @Override
    public OperationSystem findOperationSystem(int id) {
        return operationSystemRepository.findById(id);
    }

    @Override
    public OperationSystem saveOperationSystem(OperationSystem operationSystem) {
        return operationSystemRepository.save(operationSystem);
    }

    @Override
    public OperationSystem deleteOperationSystem(OperationSystem operationSystem) {
        return operationSystemRepository.delete(operationSystem);
    }

    @Override
    public OperationSystem updateOperationSystem(OperationSystem operationSystem) {
        return operationSystemRepository.update(operationSystem);
    }

    @Override
    public List<OperationSystem> getAllNoteOperationSystems() {
        return operationSystemRepository.getAll();
    }
}
