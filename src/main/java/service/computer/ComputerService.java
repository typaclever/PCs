package service.computer;

import model.computer.Computer;

import java.util.List;

public interface ComputerService {
    Computer findComputer(int id);
    Computer saveComputer(Computer computer);
    Computer deleteComputer(Computer computer);
    Computer updateComputer(Computer computer);
    List<Computer> getAllComputers();
}
