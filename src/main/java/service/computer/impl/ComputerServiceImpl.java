package service.computer.impl;

import model.computer.Computer;
import repository.computer.ComputerRepository;
import repository.computer.impl.ComputerRepositoryImpl;
import service.computer.ComputerService;

import java.util.List;

public class ComputerServiceImpl implements ComputerService {
    private ComputerRepository computerRepository = new ComputerRepositoryImpl();
    @Override
    public Computer findComputer(int id) {
        return computerRepository.findById(id);
    }

    @Override
    public Computer saveComputer(Computer computer) {
        return computerRepository.save(computer);
    }

    @Override
    public Computer deleteComputer(Computer computer) {
        return computerRepository.delete(computer);
    }

    @Override
    public Computer updateComputer(Computer computer) {
        return computerRepository.update(computer);
    }

    @Override
    public List<Computer> getAllComputers() {
        return computerRepository.getAll();
    }
}
