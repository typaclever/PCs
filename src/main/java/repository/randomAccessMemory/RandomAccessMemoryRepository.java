package repository.randomAccessMemory;

import model.randomAccesMemory.RandomAccessMemory;

public interface RandomAccessMemoryRepository {
    void save(RandomAccessMemory randomAccessMemory);
    void update(RandomAccessMemory randomAccessMemory);
    void delete(RandomAccessMemory randomAccessMemory);
    RandomAccessMemory findById(int id);
}