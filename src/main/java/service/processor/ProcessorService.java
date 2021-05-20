package service.processor;

import model.processor.Processor;

import java.util.List;

public interface ProcessorService {
    Processor findProcessor(int id);
    Processor saveProcessor(Processor processor);
    Processor deleteProcessor(Processor processor);
    Processor updateProcessor(Processor processor);
    List<Processor> getAllProcessors();
}
