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
        entityManager.persist(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return entityManager.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    @Transactional
    public void updateUser(int id, User updatedUser) {
        User userToBeUpdated = entityManager.find(User.class, id);

        if(userToBeUpdated != null) {
            userToBeUpdated.setUsername(updatedUser.getUsername());
            userToBeUpdated.setEmail(updatedUser.getEmail());
            userToBeUpdated.setAge(updatedUser.getAge());

            entityManager.merge(updatedUser);
        }
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        User userToBeDeleted = entityManager.find(User.class, id);
        entityManager.remove(userToBeDeleted);
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }
}
