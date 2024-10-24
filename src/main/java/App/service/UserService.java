package App.service;

import App.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    List<User> getAllUsers();
    User getUserById(int id);
}
