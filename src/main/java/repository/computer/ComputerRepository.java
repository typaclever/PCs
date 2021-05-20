package repository.computer;

import Exeptions.computer.ComputerDeleteException;
import Exeptions.computer.ComputerUpdateException;
import model.computer.Computer;
import java.util.List;

public interface ComputerRepository {
    Computer save(Computer computer);
    Computer update(Computer computer) throws ComputerUpdateException;
    Computer delete(Computer computer) throws ComputerDeleteException;
    List<Computer> getAll();
    Computer findById(int id);
}
