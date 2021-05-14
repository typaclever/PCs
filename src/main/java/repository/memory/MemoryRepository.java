package repository.memory;

import model.memory.Memory;

public interface MemoryRepository {
    Memory save(Memory memory);
    Memory update(Memory memory);
    Memory delete(Memory memory);
    Memory findById(int id);
}
