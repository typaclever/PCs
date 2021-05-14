package repository.operationSystem;

import model.operationSystem.OperationSystem;

import java.util.List;

public interface OperationSystemRepository {
    OperationSystem save(OperationSystem operationSystem);
    OperationSystem update(OperationSystem operationSystem);
    OperationSystem delete(OperationSystem operationSystem);
    OperationSystem findById(int id);
    List<OperationSystem> getAllOperationSystems();
}
