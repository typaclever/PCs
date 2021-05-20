package service.memory.impl;

import Exeptions.memory.MemoryDeleteException;
import Exeptions.memory.MemoryUpdateException;
import lombok.Data;
import lombok.NonNull;
import model.memory.Memory;
import repository.memory.MemoryRepository;
import service.memory.MemoryService;

import java.util.List;

@Data
public class MemoryServiceImpl implements MemoryService {
    @NonNull
    private MemoryRepository memoryRepository;

    @Override
    public Memory findMemory(int id) {
        return memoryRepository.findById(id);
    }

    @Override
    public Memory saveMemory(Memory memory) {
        return memoryRepository.save(memory);
    }

    @Override
    public Memory deleteMemory(Memory memory) {
        try {
            return memoryRepository.delete(memory);
        } catch (MemoryDeleteException e) {
            e.printStackTrace();
        }
        return memory;
    }

    @Override
    public Memory updateMemory(Memory memory) {
        try {
            return memoryRepository.update(memory);
        } catch (MemoryUpdateException e) {
            e.printStackTrace();
        }
        return memory;
    }

    @Override
    public List<Memory> getAllMemories() {
        return memoryRepository.getAll();
    }
}
