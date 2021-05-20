package service.connection.impl;

import Exeptions.computer.ComputerDeleteException;
import Exeptions.connection.ConnectionUpdateException;
import lombok.Data;
import lombok.NonNull;
import model.connection.Connection;
import repository.connection.ConnectionRepository;
import repository.connection.impl.ConnectionRepositoryImpl;
import service.connection.ConnectionService;

import java.util.List;

@Data
public class ConnectionServiceImpl implements ConnectionService {
    @NonNull
    private ConnectionRepository connectionRepository;

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
        try {
            return connectionRepository.delete(connection);
        } catch (ComputerDeleteException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public Connection updateConnection(Connection connection) {
        try {
            return connectionRepository.update(connection);
        } catch (ConnectionUpdateException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public List<Connection> getAllConnections() {
        return connectionRepository.getAll();
    }
}
