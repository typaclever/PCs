package service.processor.impl;

import Exeptions.processor.ProcessorDeleteException;
import Exeptions.processor.ProcessorUpdateException;
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
        try {
            return processorRepository.delete(processor);
        } catch (ProcessorDeleteException e) {
            e.printStackTrace();
        }
        return processor;
    }

    @Override
    public Processor updateProcessor(Processor processor) {
        try {
            return processorRepository.update(processor);
        } catch (ProcessorUpdateException e) {
            e.printStackTrace();
        }
        return processor;
    }

    @Override
    public List<Processor> getAllProcessors() {
        return processorRepository.getAll();
    }
}
