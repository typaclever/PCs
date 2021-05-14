package repository.Computer;

import someModels.Computer.Computer;

public interface ComputerRepository {
    void save(Computer computer);
    void update(Computer computer);
    void delete(Computer computer);
    Computer findById(int id);
}
