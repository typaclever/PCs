package repository.operationSystem;

import model.operationSystem.OperationSystem;

public interface OperationSystemRepository {
    void save(OperationSystem operationSystem);
    void update(OperationSystem operationSystem);
    void delete(OperationSystem operationSystem);
    OperationSystem findById(int id);
}
