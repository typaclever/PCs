package service.connection.impl;

import model.connection.Connection;
import repository.connection.ConnectionRepository;
import repository.connection.impl.ConnectionRepositoryImpl;
import service.connection.ConnectionService;

import java.util.List;

public class ConnectionServiceImpl implements ConnectionService {
    private ConnectionRepository connectionRepository = new ConnectionRepositoryImpl();

    @Override
    public Connection findConnection(int id) {
        return connectionRepository.findById(id);
    }

    @Override
    public Connection saveConnection(Connection connection) {
        return connectionRepository.save(connection);
    }

    @Override
    public Connection deleteConnection(Connection connection) {
        return connectionRepository.delete(connection);
    }

    @Override
    public Connection updateConnection(Connection connection) {
        return connectionRepository.update(connection);
    }

    @Override
    public List<Connection> getAllConnections() {
        return connectionRepository.getAll();
    }
}
