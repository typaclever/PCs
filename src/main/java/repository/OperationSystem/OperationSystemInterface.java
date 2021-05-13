package repository.OperationSystem;

import someModels.OperationSystem.OperationSystem;

public interface OperationSystemInterface {
    void save(OperationSystem operationSystem);
    void update(OperationSystem operationSystem);
    void delete(OperationSystem operationSystem);
    OperationSystem findById(int id);
}
