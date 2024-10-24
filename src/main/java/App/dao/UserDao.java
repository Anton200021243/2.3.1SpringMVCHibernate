package App.dao;

import App.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void addUser(User user);
    void updateUser(int id);
    void deleteUser(int id);
    User getUserById(int id);
}
