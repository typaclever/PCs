package repository.connection;

import model.connection.Connection;

public interface ConnectionRepository {
    void save(Connection connection);
    void update(Connection connection);
    void delete(Connection connection);
    Connection findById(int id);
}
