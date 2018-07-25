package Service;

import Entity.User;

import javax.ejb.Remote;
import java.util.Collection;

@Remote
public interface UserServiceLocal {

    void addUser(User user);

    void  updateUser(User user);

    Collection<?> getAllUsers();

    User getUserById(Long id);

    User getUserByUsername(String username);
    boolean checkUsername(String username);


    boolean validateUser(String username, String password);



}
