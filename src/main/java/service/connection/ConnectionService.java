package service.connection;

import model.connection.Connection;
import model.user.User;

import java.util.List;

public interface ConnectionService {
    Connection findConnection(int id);
    Connection saveConnection(Connection connection);
    Connection deleteConnection(Connection connection);
    Connection updateConnection(Connection connection);
    List<Connection> getAllConnections();
}
