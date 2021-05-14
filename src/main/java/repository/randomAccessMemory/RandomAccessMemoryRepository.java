package repository.randomAccessMemory;

import model.randomAccesMemory.RandomAccessMemory;

public interface RandomAccessMemoryRepository {
    RandomAccessMemory save(RandomAccessMemory randomAccessMemory);
    RandomAccessMemory update(RandomAccessMemory randomAccessMemory);
    RandomAccessMemory delete(RandomAccessMemory randomAccessMemory);
    RandomAccessMemory findById(int id);
}
