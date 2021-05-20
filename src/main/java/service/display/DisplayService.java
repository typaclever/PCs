package service.display;

import model.display.Display;

import java.util.List;

public interface DisplayService {
    Display findDisplay(int id);
    Display saveDisplay(Display display);
    Display deleteDisplay(Display display);
    Display updateDisplay(Display display);
    List<Display> getAllDisplays();
}
