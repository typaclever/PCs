package repository.display;

import model.Display.Display;

public interface DisplayRepository {
    void save(Display display);
    void update(Display display);
    void delete(Display display);
    Display findById(int id);
}
