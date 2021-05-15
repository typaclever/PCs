package service.memory.impl;

import model.memory.Memory;
import repository.memory.MemoryRepository;
import repository.memory.impl.MemoryRepositoryImpl;
import service.memory.MemoryService;

import java.util.List;

public class MemoryServiceImpl implements MemoryService {
    private MemoryRepository memoryRepository = new MemoryRepositoryImpl();
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
        return memoryRepository.delete(memory);
    }

    @Override
    public Memory updateMemory(Memory memory) {
        return memoryRepository.update(memory);
    }

    @Override
    public List<Memory> getAllMemories() {
        return memoryRepository.getAll();
    }
}
