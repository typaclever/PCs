package service.connection;

import model.connection.Connection;
import model.user.User;

import java.util.List;

public interface ConnectionService {
    Connection findConnection(int id);
    Connection saveConnection(User user);
    Connection deleteConnection(User user);
    Connection updateConnection(User user);
    List<Connection> getAllConnections();
}
