package service.display.impl;

import Exeptions.display.DisplayDeleteException;
import Exeptions.display.DisplayUpdateException;
import lombok.Data;
import lombok.NonNull;
import model.display.Display;
import repository.display.DisplayRepository;
import service.display.DisplayService;

import java.util.List;

@Data
public class DisplayServiceImpl implements DisplayService {
    @NonNull
    private DisplayRepository displayRepository;

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
        try {
            return displayRepository.delete(display);
        } catch (DisplayDeleteException e) {
            e.printStackTrace();
        }
        return display;
    }

    @Override
    public Display updateDisplay(Display display) {
        try {
            return displayRepository.update(display);
        } catch (DisplayUpdateException e) {
            e.printStackTrace();
        }
        return display;
    }

    @Override
    public List<Display> getAllDisplays() {
        return displayRepository.getAll();
    }
}
