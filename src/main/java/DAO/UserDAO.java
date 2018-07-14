package DAO;

import Entity.UserEntity;

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

@Local
@Stateless
public class UserDAO implements UserDAOLocal {

    @PersistenceContext
    
     EntityManager em;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void addUser( UserEntity user){
    try{
        em.persist(user);
    } catch (Exception e ){
        System.out.println("CATCH");

      }
    }


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  UserEntity getUserById (Integer id ){

        return (UserEntity)  em.createQuery(" SELECT u FROM user u WHERE u.id =: id ").setParameter("id", id).getSingleResult();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  UserEntity getUserByUsername(String username){

        return (UserEntity)  em.createQuery("SELECT u FROM user u WHERE u.username=: username").setParameter("username", username).getSingleResult();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Collection<?> getAllusers(){

        return  (List<UserEntity>) em.createQuery("FROM user").getResultList();

    }


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public boolean validateusername (String username, String password) {
        return  em.createQuery("SELECT u FROM user  WHERE  u.username=: username AND u.password=: password")
                .setParameter("username", username).setParameter("password", password)
                .setMaxResults(1).getResultList().isEmpty();
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public boolean checkusername (String username){
        return em.createQuery("SELECT u FROM user  WHERE u.username=: username ")
                .setParameter("username", username).setMaxResults(1).getResultList().isEmpty();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void updateUser (UserEntity user){

    }


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void deleteUser(String username){

         em.createQuery("DELETE u FROM user WHERE u.username =: username").setParameter("username", username);


    }



}
