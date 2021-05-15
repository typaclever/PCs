package service.randomAccesMemory;

import model.randomAccesMemory.RandomAccessMemory;

import java.util.List;

public interface RandomAccesMemoryService {
    RandomAccessMemory findRandomAccessMemory(int id);
    RandomAccessMemory saveRandomAccessMemory(RandomAccessMemory randomAccessMemory);
    RandomAccessMemory deleteRandomAccessMemory(RandomAccessMemory randomAccessMemory);
    RandomAccessMemory updateRandomAccessMemory(RandomAccessMemory randomAccessMemory);
    List<RandomAccessMemory> getAllRandomAccessMemories();
}
