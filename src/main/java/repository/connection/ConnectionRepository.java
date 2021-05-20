package repository.connection;

import Exeptions.connection.ConnectionDeleteException;
import Exeptions.connection.ConnectionUpdateException;
import model.connection.Connection;

import java.util.List;

public interface ConnectionRepository {
    Connection save(Connection connection);
    Connection update(Connection connection) throws ConnectionUpdateException;
    Connection delete(Connection connection) throws ConnectionDeleteException;
    Connection findById(int id);
    List<Connection> getAll();
}
