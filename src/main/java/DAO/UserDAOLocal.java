
/**
 * @Author: Marvelous
 * @Github: vester3500
 * @Project: XML-Parsing-REST-API
 **/

package DAO;

import Entity.User;

import javax.ejb.Local;
import java.util.Collection;


@Local
public interface UserDAOLocal {

    public  void addUser( User user);

    public User getUserById (Integer id );

    public User getUserByUsername(String username);

    public Collection<?> getAllusers();

    public boolean validateusername (String username, String password);

    public boolean checkusername (String username);

    public  void updateUser (User user);

    public  void deleteUser(String username);
}
