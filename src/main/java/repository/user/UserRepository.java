package repository.user;

import Exeptions.User.UserDeleteException;
import Exeptions.User.UserUpdateException;
import model.user.User;

import java.util.List;

public interface UserRepository {
    User save(User user);
    User update(User user) throws UserUpdateException;
    User delete(User user) throws UserDeleteException;
    User findById(String id);
    List<User> findAll();
}
