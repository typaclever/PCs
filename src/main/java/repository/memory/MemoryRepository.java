package repository.memory;

import model.Memory.Memory;

public interface MemoryRepository {
    void save(Memory memory);
    void update(Memory memory);
    void delete(Memory memory);
    Memory findById(int id);
}
