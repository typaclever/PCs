package service.operationSystem;

import model.operationSystem.OperationSystem;

import java.util.List;

public interface OperationSystemService {
    OperationSystem findOperationSystem(int id);
    OperationSystem saveOperationSystem(OperationSystem operationSystem);
    OperationSystem deleteOperationSystem(OperationSystem operationSystem);
    OperationSystem updateOperationSystem(OperationSystem operationSystem);
    List<OperationSystem> getAllNoteOperationSystems();
}
