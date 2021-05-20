package repository.memory;

import Exeptions.memory.MemoryDeleteException;
import Exeptions.memory.MemoryUpdateException;
import model.memory.Memory;

import java.util.List;

public interface MemoryRepository {
    Memory save(Memory memory);
    Memory update(Memory memory) throws MemoryUpdateException;
    Memory delete(Memory memory) throws MemoryDeleteException;
    Memory findById(int id);
    List<Memory> getAll();
}
