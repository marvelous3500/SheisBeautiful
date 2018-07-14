package Service;

import DAO.UserDAOLocal;
import Entity.UserEntity;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Collection;


@Local
@Stateless
public class User implements UserLocal {

    @Inject
    private UserDAOLocal  userBean;

    public void adduser(UserEntity user) {
          userBean.addUser(user);
    }

    public UserEntity  getUserByUsername(String username){

        return userBean.getUserByUsername(username);
    }

    public UserEntity getUserById(Integer id ){
        return userBean.getUserById(id);

    }

    public  void updateUser(UserEntity user){

        userBean.updateUser( user);
    }

    public  void deleteUser(String username) {
        userBean.deleteUser(username);
    }


    public boolean checkusername(String username) {
        return  userBean.checkusername(username);
    }

    public boolean validateUser (String username, String password) {

        return userBean.validateusername(username, password);
    }

    public Collection<?> getAllUsers(){

        return userBean.getAllusers();
    }

}
