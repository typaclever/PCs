package service.randomAccessMemory.impl;

import Exeptions.randomAccessMemory.RandomAccessMemoryDeleteException;
import Exeptions.randomAccessMemory.RandomAccessMemoryUpdateException;
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
        try {
            return repository.delete(randomAccessMemory);
        } catch (RandomAccessMemoryDeleteException e) {
            e.printStackTrace();
        }
        return randomAccessMemory;
    }

    @Override
    public RandomAccessMemory updateRandomAccessMemory(RandomAccessMemory randomAccessMemory) {
        try {
            return repository.update(randomAccessMemory);
        } catch (RandomAccessMemoryUpdateException e) {
            e.printStackTrace();
        }
        return randomAccessMemory;
    }

    @Override
    public List<RandomAccessMemory> getAllRandomAccessMemories() {
        return repository.getAll();
    }
}
