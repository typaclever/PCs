package service.memory;

import model.memory.Memory;

import java.util.List;

public interface MemoryService {
    Memory findMemory(int id);
    Memory saveMemory(Memory memory);
    Memory deleteMemory(Memory memory);
    Memory updateMemory(Memory memory);
    List<Memory> getAllMemories();
}
