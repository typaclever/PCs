package repository.connection;

import Exeptions.computer.ComputerDeleteException;
import Exeptions.connection.ConnectionUpdateException;
import model.connection.Connection;

import java.util.List;

public interface ConnectionRepository {
    Connection save(Connection connection);
    Connection update(Connection connection) throws ConnectionUpdateException;
    Connection delete(Connection connection) throws ComputerDeleteException;
    Connection findById(int id);
    List<Connection> getAll();
}
