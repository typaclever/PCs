package repository.Display;

import someModels.Display.Display;

public interface DisplayInterface {
    void save(Display display);
    void update(Display display);
    void delete(Display display);
    Display findById(int id);
}
