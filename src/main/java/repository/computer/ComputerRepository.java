package repository.computer;

import model.Computer.Computer;

public interface ComputerRepository {
    Computer save(Computer computer);
    Computer update(Computer computer);
    void delete(Computer computer);
    Computer findById(int id);
}
