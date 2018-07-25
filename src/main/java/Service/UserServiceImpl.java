package Service;


import DAO.UserLocal;
import Entity.User;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.Collection;

@Remote
@Stateless
public class UserServiceImpl implements  UserServiceLocal {

    @EJB
    private UserLocal userDaoBean;


    public  void addUser(User user){

        userDaoBean.addUser(user);
    }

    public void  updateUser ( User user ) {

        userDaoBean.updateUser(user);

    }

    public Collection<?> getAllUsers() {
        return userDaoBean.getAllUsers();
    }

    public  User getUserById(Long id){
        return userDaoBean.getUserById(id);
    }

    public  User getUserByUsername(String username){
        return userDaoBean.getUserByUsername(username);
    }

    public  boolean validateUser(String username , String password){
        return userDaoBean.validateUser(username, password);
    }

    public  boolean  checkUsername (String username) {
        return userDaoBean.checkUsername(username);
    }

}
