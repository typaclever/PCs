package repository.memory;

import model.memory.Memory;

import java.util.List;

public interface MemoryRepository {
    Memory save(Memory memory);
    Memory update(Memory memory);
    Memory delete(Memory memory);
    Memory findById(int id);
    List<Memory> getAll();
}
