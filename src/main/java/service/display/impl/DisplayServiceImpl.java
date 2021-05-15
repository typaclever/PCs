package service.display.impl;

import model.display.Display;
import repository.display.DisplayRepository;
import repository.display.impl.DisplayRepositoryImpl;
import service.display.DisplayService;

import java.util.List;

public class DisplayServiceImpl implements DisplayService {
    private DisplayRepository displayRepository = new DisplayRepositoryImpl();
    @Override
    public Display findDisplay(int id) {
        return displayRepository.findById(id);
    }

    @Override
    public Display saveDisplay(Display display) {
        return displayRepository.save(display);
    }

    @Override
    public Display deleteDisplay(Display display) {
        return displayRepository.delete(display);
    }

    @Override
    public Display updateDisplay(Display display) {
        return displayRepository.update(display);
    }

    @Override
    public List<Display> getAllDisplays() {
        return displayRepository.getAll();
    }
}
