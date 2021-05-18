package service.randomAccessMemory.impl;

import lombok.Data;
import lombok.NonNull;
import model.randomAccesMemory.RandomAccessMemory;
import repository.randomAccessMemory.RandomAccessMemoryRepository;
import service.randomAccessMemory.RandomAccessMemoryService;

import java.util.List;

@Data
public class RandomAccessMemoryServiceImpl implements RandomAccessMemoryService {
    @NonNull
    private RandomAccessMemoryRepository repository;

    @Override
    public RandomAccessMemory findRandomAccessMemory(int id) {
        return repository.findById(id);
    }

    @Override
    public RandomAccessMemory saveRandomAccessMemory(RandomAccessMemory randomAccessMemory) {
        return repository.save(randomAccessMemory);
    }

    @Override
    public RandomAccessMemory deleteRandomAccessMemory(RandomAccessMemory randomAccessMemory) {
        return repository.delete(randomAccessMemory);
    }

    @Override
    public RandomAccessMemory updateRandomAccessMemory(RandomAccessMemory randomAccessMemory) {
        return repository.update(randomAccessMemory);
    }

    @Override
    public List<RandomAccessMemory> getAllRandomAccessMemories() {
        return repository.getAll();
    }
}
