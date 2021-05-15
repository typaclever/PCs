package service.randomAccessMemory;

import model.randomAccesMemory.RandomAccessMemory;
import model.user.User;

import java.util.List;

public interface RandomAccessMemoryService {
    RandomAccessMemory findRandomAccessMemory(int id);
    RandomAccessMemory saveRandomAccessMemory(RandomAccessMemory randomAccessMemory);
    RandomAccessMemory deleteRandomAccessMemory(RandomAccessMemory randomAccessMemory);
    RandomAccessMemory updateRandomAccessMemory(RandomAccessMemory randomAccessMemory);
    List<RandomAccessMemory> getAllRandomAccessMemories();
}
