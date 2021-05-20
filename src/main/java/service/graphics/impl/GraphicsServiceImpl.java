package service.graphics.impl;

import Exeptions.graphics.GraphicsDeleteException;
import Exeptions.graphics.GraphicsUpdateException;
import lombok.Data;
import lombok.NonNull;
import model.graphics.Graphics;
import repository.graphics.GraphicsRepository;
import service.graphics.GraphicsService;

import java.util.List;

@Data
public class GraphicsServiceImpl implements GraphicsService {
    @NonNull
    private GraphicsRepository graphicsRepository;

    @Override
    public Graphics findGraphics(int id) {
        return graphicsRepository.findById(id);
    }

    @Override
    public Graphics saveGraphics(Graphics graphics) {
        return graphicsRepository.save(graphics);
    }

    @Override
    public Graphics deleteGraphics(Graphics graphics){
        try {
            return graphicsRepository.delete(graphics);
        } catch (GraphicsDeleteException e) {
            e.printStackTrace();
        }
        return graphics;
    }

    @Override
    public Graphics updateGraphics(Graphics graphics) {
        try {
            return graphicsRepository.update(graphics);
        } catch (GraphicsUpdateException e) {
            e.printStackTrace();
        }
        return graphics;
    }

    @Override
    public List<Graphics> getAllGraphics() {
        return graphicsRepository.getAll();
    }
}
