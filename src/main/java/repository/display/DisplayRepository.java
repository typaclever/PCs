package repository.display;

import model.display.Display;

public interface DisplayRepository {
    Display save(Display display);
    Display update(Display display);
    Display delete(Display display);
    Display findById(int id);
}
