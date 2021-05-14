package repository.connection;

import model.connection.Connection;

import java.util.List;

public interface ConnectionRepository {
    Connection save(Connection connection);
    Connection update(Connection connection);
    Connection delete(Connection connection);
    Connection findById(int id);
    List<Connection> getAllConnections();
}
