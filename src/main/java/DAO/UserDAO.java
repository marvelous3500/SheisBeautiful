package DAO;


/**
 * @Author: Marvelous Sylvester
 * @Github: vester3500
 * @Project: XML-Parsing-REST-API
 **/




import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;
import Entity.User;

@Local
@Stateless
public class UserDAO implements UserDAOLocal {

    @PersistenceContext
    
     EntityManager em;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void addUser( User user){
  
        em.persist(user);
    
    }


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public User getUserById (Integer id ){

        return (User)  em.createQuery("SELECT u FROM User u WHERE u.id=:id").setParameter("id", id).getSingleResult();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public User getUserByUsername(String username){

        return (User)  em.createQuery("SELECT m FROM User m WHERE m.username=:username").setParameter("username", username).getSingleResult();
    }


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Collection<?> getAllusers(){

        return  (List<User>) em.createQuery("FROM User").getResultList();

    }


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public boolean validateusername (String username, String password) {
        return  em.createQuery("SELECT u FROM User u WHERE  u.username=:username AND u.password=:password")
                .setParameter("username", username).setParameter("password", password)
                .setMaxResults(1).getResultList().isEmpty();
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public boolean checkusername (String username){
        return em.createQuery("SELECT u FROM User u WHERE u.username=:username")
                .setParameter("username", username).setMaxResults(1).getResultList().isEmpty();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void updateUser (User user){
		em.merge(user);

    }


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void deleteUser(String username){

         em.createQuery("DELETE u FROM User WHERE u.username =: username").setParameter("username", username);


    }



}
