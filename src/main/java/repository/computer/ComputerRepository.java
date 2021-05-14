package repository.computer;

import model.computer.Computer;

public interface ComputerRepository {
    Computer save(Computer computer);
    Computer update(Computer computer);
    Computer delete(Computer computer);
    Computer findById(int id);
}
