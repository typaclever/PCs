package repository.RandomAccessMemory;

import someModels.RandomAccesMemory.RandomAccessMemory;

public interface RandomAccessMemoryRepository {
    void save(RandomAccessMemory randomAccessMemory);
    void update(RandomAccessMemory randomAccessMemory);
    void delete(RandomAccessMemory randomAccessMemory);
    RandomAccessMemory findById(int id);
}
