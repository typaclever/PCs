package service.user;

import model.user.User;

import java.util.List;

public interface UserService {
    User findUser(String id);
    User saveUser(User user);
    User deleteUser(User user);
    User updateUser(User user);
    List<User> getAllUsers();
}
