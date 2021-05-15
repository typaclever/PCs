package repository.graphics;

import model.graphics.Graphics;

import java.util.List;

public interface GraphicsRepository {
    Graphics save(Graphics graphics);
    Graphics update(Graphics graphics);
    Graphics delete(Graphics graphics);
    Graphics findById(int id);
    List<Graphics> getAll();
}
