package Service;

import Entity.User;

import javax.ejb.Local;
import java.util.Collection;


@Local
public interface UserLocal {

    public  void adduser(User user);

    public User getUserByUsername(String username);

    public User getUserById(Integer id);

    public Collection<?> getAllUsers();

    public  boolean validateUser(String username, String password);

    public boolean checkusername(String username);

    public  void updateUser(User user);

    public  void deleteUser(String username);



}

