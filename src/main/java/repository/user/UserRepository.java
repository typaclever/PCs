package repository.user;

import model.user.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User update(User user);
    User delete(User user);
    User findById(int id);
    List<User> findAll();
}
