package repository.processor;

import model.Processor.Processor;

public interface ProcessorRepository {
    void save(Processor processor);
    void update(Processor processor);
    void delete(Processor processor);
    Processor findById(int id);
}
