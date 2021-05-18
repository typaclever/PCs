package service.processor.impl;

import lombok.Data;
import lombok.NonNull;
import model.processor.Processor;
import repository.processor.ProcessorRepository;
import service.processor.ProcessorService;

import java.util.List;

@Data
public class ProcessorServiceImpl implements ProcessorService {
    @NonNull
    private ProcessorRepository processorRepository;

    @Override
    public Processor findProcessor(int id) {
        return processorRepository.findById(id);
    }

    @Override
    public Processor saveProcessor(Processor processor) {
        return processorRepository.save(processor);
    }

    @Override
    public Processor deleteProcessor(Processor processor) {
        return processorRepository.delete(processor);
    }

    @Override
    public Processor updateProcessor(Processor processor) {
        return processorRepository.update(processor);
    }

    @Override
    public List<Processor> getAllProcessors() {
        return processorRepository.getAll();
    }
}
