package repository.Graphics;

import someModels.Graphics.Graphics;

public interface GraphicsRepository {
    void save(Graphics graphics);
    void update(Graphics graphics);
    void delete(Graphics graphics);
    Graphics findById(int id);
}
