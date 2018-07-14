package Service;

import Entity.UserEntity;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.util.Collection;
import java.util.Collections;



@Local
public interface UserLocal {

    public  void adduser(UserEntity user);

    public  UserEntity getUserByUsername(String username);

    public  UserEntity getUserById(Integer id);

    public Collection<?> getAllUsers();

    public  boolean validateUser(String username, String password);

    public boolean checkusername(String username);

    public  void updateUser(UserEntity user);

    public  void deleteUser(String username);



}

