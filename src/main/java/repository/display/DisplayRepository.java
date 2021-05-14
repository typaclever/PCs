package repository.display;

import model.display.Display;

public interface DisplayRepository {
    void save(Display display);
    void update(Display display);
    void delete(Display display);
    Display findById(int id);
}
