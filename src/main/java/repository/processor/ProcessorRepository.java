package repository.processor;

import Exeptions.processor.ProcessorDeleteException;
import Exeptions.processor.ProcessorUpdateException;
import model.processor.Processor;

import java.util.List;

public interface ProcessorRepository {
    Processor save(Processor processor);
    Processor update(Processor processor) throws ProcessorUpdateException;
    Processor delete(Processor processor) throws ProcessorDeleteException;
    Processor findById(int id);
    List<Processor> getAll();
}
