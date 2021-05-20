package service.computer.impl;

import Exeptions.computer.ComputerDeleteException;
import Exeptions.computer.ComputerUpdateException;
import lombok.Data;
import lombok.NonNull;
import model.computer.Computer;
import repository.computer.ComputerRepository;
import service.computer.ComputerService;

import java.util.List;

@Data
public class ComputerServiceImpl implements ComputerService {

    @NonNull
    private ComputerRepository computerRepository;

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
        try {
            return computerRepository.delete(computer);
        }catch (ComputerDeleteException cde){
            cde.printStackTrace();
        }
        return computer;
    }

    @Override
    public Computer updateComputer(Computer computer) {
        try {
            return computerRepository.update(computer);
        } catch (ComputerUpdateException cue) {
            cue.printStackTrace();
        }
        return computer;
    }

    @Override
    public List<Computer> getAllComputers() {
        return computerRepository.getAll();
    }
}
