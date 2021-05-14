package repository.processor;

import model.processor.Processor;

public interface ProcessorRepository {
    Processor save(Processor processor);
    Processor update(Processor processor);
    Processor delete(Processor processor);
    Processor findById(int id);
}
