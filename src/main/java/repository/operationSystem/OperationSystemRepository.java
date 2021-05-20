package repository.operationSystem;

import Exeptions.noteBook.NoteBookDeleteException;
import Exeptions.noteBook.NoteBookUpdateException;
import Exeptions.operationSystem.OperationSystemDeleteException;
import Exeptions.operationSystem.OperationSystemUpdateException;
import model.operationSystem.OperationSystem;

import java.util.List;

public interface OperationSystemRepository {
    OperationSystem save(OperationSystem operationSystem);
    OperationSystem update(OperationSystem operationSystem) throws OperationSystemUpdateException;
    OperationSystem delete(OperationSystem operationSystem) throws OperationSystemDeleteException;
    OperationSystem findById(int id);
    List<OperationSystem> getAll();
}
