package service.user.impl;

import Exeptions.User.UserDeleteException;
import Exeptions.User.UserUpdateException;
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
    public User findUser(String id) {
        return repository.findById(id);
    }

    @Override
    public User saveUser(User user) {
        return repository.save(user);
    }

    @Override
    public User deleteUser(User user) {
        try {
            return repository.delete(user);
        } catch (UserDeleteException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User updateUser(User user) {
        try {
            return repository.update(user);
        } catch (UserUpdateException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
