package service.graphics;

import model.graphics.Graphics;

import java.util.List;

public interface GraphicsService {
    Graphics findGraphics(int id);
    Graphics saveGraphics(Graphics graphics);
    Graphics deleteGraphics(Graphics graphics);
    Graphics updateGraphics(Graphics graphics);
    List<Graphics> getAllGraphics();
}
