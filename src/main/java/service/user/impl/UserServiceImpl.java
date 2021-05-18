package service.user.impl;

import lombok.Data;
import lombok.NonNull;
import model.user.User;
import repository.user.UserRepository;
import service.user.UserService;

import java.util.List;

@Data
public class UserServiceImpl implements UserService {
    @NonNull
    private UserRepository repository;

    @Override
    public User findUser(int id) {
        return repository.findById(id);
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public User deleteUser(User user) {
        return repository.delete(user);
    }

    @Override
    public User updateUser(User user) {
        return repository.update(user);
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
