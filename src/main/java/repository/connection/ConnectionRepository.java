package repository.connection;

import model.connection.Connection;

public interface ConnectionRepository {
    Connection save(Connection connection);
    Connection update(Connection connection);
    Connection delete(Connection connection);
    Connection findById(int id);
}
