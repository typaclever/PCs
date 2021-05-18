package service.memory.impl;

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
