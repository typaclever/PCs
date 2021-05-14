package repository.Connection;

import someModels.Connection.Connection;

public interface ConnectionRepository {
    void save(Connection connection);
    void update(Connection connection);
    void delete(Connection connection);
    Connection findById(int id);
}
