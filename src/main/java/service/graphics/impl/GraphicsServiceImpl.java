package service.graphics.impl;

import model.graphics.Graphics;
import repository.graphics.GraphicsRepository;
import repository.graphics.impl.GraphicsRepositoryImpl;
import service.graphics.GraphicsService;

import java.util.List;

public class GraphicsServiceImpl implements GraphicsService {
    private GraphicsRepository graphicsRepository = new GraphicsRepositoryImpl();
    @Override
    public Graphics findGraphics(int id) {
        return graphicsRepository.findById(id);
    }

    @Override
    public Graphics saveGraphics(Graphics graphics) {
        return graphicsRepository.save(graphics);
    }

    @Override
    public Graphics deleteGraphics(Graphics graphics) {
        return graphicsRepository.delete(graphics);
    }

    @Override
    public Graphics updateGraphics(Graphics graphics) {
        return graphicsRepository.update(graphics);
    }

    @Override
    public List<Graphics> getAllGraphics() {
        return graphicsRepository.getAll();
    }
}
