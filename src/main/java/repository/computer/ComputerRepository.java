package repository.computer;

import model.computer.Computer;

import java.util.List;

public interface ComputerRepository {
    Computer save(Computer computer);
    Computer update(Computer computer);
    Computer delete(Computer computer);
    List<Computer> getAll();
    Computer findById(int id);
}
