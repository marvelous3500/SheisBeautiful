package Service;

import DAO.UserDAOLocal;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.Collection;


@Local
@Stateless
public class User implements UserLocal {

    @EJB
    private UserDAOLocal  userBean;

    public void adduser(Entity.User user) {
          userBean.addUser(user);
    }

    public Entity.User getUserByUsername(String username){

        return userBean.getUserByUsername(username);
    }

    public Entity.User getUserById(Integer id ){
        return userBean.getUserById(id);

    }

    public  void updateUser(Entity.User user){

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
