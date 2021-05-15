package service.operationSystem.impl;

import model.operationSystem.OperationSystem;
import repository.operationSystem.OperationSystemRepository;
import repository.operationSystem.impl.OperationSystemRepositoryImpl;
import service.operationSystem.OperationSystemService;

import java.util.List;

public class OperationSystemServiceImpl implements OperationSystemService {
    private OperationSystemRepository operationSystemRepository = new OperationSystemRepositoryImpl();
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