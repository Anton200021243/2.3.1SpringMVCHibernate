package App.service;

import App.dao.UserDao;
import App.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void updateUser(int id) {
        userDao.updateUser(id);
    }

    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
