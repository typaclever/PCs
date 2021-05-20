package repository.display;

import Exeptions.display.DisplayDeleteException;
import Exeptions.display.DisplayUpdateException;
import model.display.Display;

import java.util.List;

public interface DisplayRepository {
    Display save(Display display);
    Display update(Display display) throws DisplayUpdateException;
    Display delete(Display display) throws DisplayDeleteException;
    Display findById(int id);
    List<Display> getAll();
}
