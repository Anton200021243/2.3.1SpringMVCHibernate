package App.dao;

import App.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void addUser(User user) {

    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    @Transactional
    public void updateUser(User user) {

    }

    @Override
    @Transactional
    public void deleteUser(int id) {

    }

    @Override
    @Transactional(readOnly = true)
    public User getUser(int id) {
        return null;
    }
}
