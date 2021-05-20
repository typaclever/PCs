package repository.graphics;

import Exeptions.graphics.GraphicsDeleteException;
import Exeptions.graphics.GraphicsUpdateException;
import model.graphics.Graphics;

import java.util.List;

public interface GraphicsRepository {
    Graphics save(Graphics graphics);
    Graphics update(Graphics graphics) throws GraphicsUpdateException;
    Graphics delete(Graphics graphics) throws GraphicsDeleteException;
    Graphics findById(int id);
    List<Graphics> getAll();
}
