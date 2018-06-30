
/**
 * @Author: marvelous sylvester
 * @Github: vester3500
 * @Project: XML-Parsing-REST-API
 **/

package DAO;

import Entity.UserEntity;

import javax.ejb.Local;
import java.util.Collection;


@Local
public interface UserDAOLocal {

    public  void addUser( UserEntity user);

    public  UserEntity getUserById (Integer id );

    public  UserEntity getUserByUsername(String username);

    public Collection<?> getAllusers();

    public boolean validateusername (String username, String password);

    public boolean checkusername (String username);

    public  void updateUser (UserEntity user);

    public  void deleteUser(String username);
}
