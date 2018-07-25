package DAO;


import javax.ejb.Remote;
import javax.ejb.Stateless;
import Entity.User;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;


@Remote
@Stateless
public class UserImpl implements  UserLocal {

    @PersistenceContext
     private EntityManager em ;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void addUser(User user) {
        em.persist(user);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void  updateUser (User user) {
        em.merge(user);
        }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Collection<?> getAllUsers() {

        List<User> allusers = (List<User>) em.createQuery("FROM User ").getResultList();

        return allusers;
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public User  getUserById(Long id ){

            User  singleUser = (User) em.createQuery("SELECT u FROM User u  WHERE u.id=:id")
                .setParameter("id", id).setMaxResults(1).getSingleResult();
            return singleUser;

    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  User getUserByUsername(String username){

        return  (User)  em.createQuery("SELECT u FROM User u  WHERE u.username =:username")
                .setParameter("username", username). setMaxResults(1).getSingleResult();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public boolean  validateUser(String username, String password){
        return em.createQuery("SELECT u  FROM User u WHERE u.username=:username AND u.password=:password").setParameter("username", username).setParameter("password", password).setMaxResults(1).getResultList().isEmpty();
    }

    public boolean checkUsername (String username){
        return em.createQuery("SELECT c FROM  User c WHERE c.username =:username").setParameter("username", username).setMaxResults(1).getResultList().isEmpty();
    }


}
