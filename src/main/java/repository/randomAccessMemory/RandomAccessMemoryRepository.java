package repository.randomAccessMemory;

import Exeptions.randomAccessMemory.RandomAccessMemoryDeleteException;
import Exeptions.randomAccessMemory.RandomAccessMemoryUpdateException;
import model.randomAccesMemory.RandomAccessMemory;

import java.util.List;

public interface RandomAccessMemoryRepository {
    RandomAccessMemory save(RandomAccessMemory randomAccessMemory);
    RandomAccessMemory update(RandomAccessMemory randomAccessMemory) throws RandomAccessMemoryUpdateException;
    RandomAccessMemory delete(RandomAccessMemory randomAccessMemory) throws RandomAccessMemoryDeleteException;
    RandomAccessMemory findById(int id);
    List<RandomAccessMemory> getAll();
}
