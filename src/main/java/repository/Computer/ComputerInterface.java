package repository.Computer;

import someModels.Computer.Computer;

public interface ComputerInterface {
    void save(Computer computer);
    void update(Computer computer);
    void delete(Computer computer);
    Computer findById(int id);
}
