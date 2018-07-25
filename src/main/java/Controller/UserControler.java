package Controller;


import Entity.User;
import Service.UserServiceLocal;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/user")
public class UserControler {

    @EJB
    private UserServiceLocal userServiceBean;

    @POST
    @Path("/adduser")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addUser(User user) {
        userServiceBean.addUser(user);
    }

    @POST
    @Path("/updateuser")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateUser(User user) {
        userServiceBean.updateUser(user);
    }


    @GET
    @Path("/getalluser")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<?> getAllUser() {
        return userServiceBean.getAllUsers();
    }


    @GET
    @Path("/getuserbyid/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById ( @PathParam("id") Long id){
        return  userServiceBean.getUserById(id);
    }

    @GET
    @Path("/getuserbyusername/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserByUsername( @PathParam("username") String username){
        return userServiceBean.getUserByUsername(username);
    }

    @GET
    @Path("/login/{username}/{password}")
    @Produces(MediaType.APPLICATION_JSON)
    public boolean validateUser( @PathParam("username") String username, @PathParam("passsword") String password){

        return userServiceBean.validateUser(username, password);
    }

    @GET
    @Path("/checkusername/{username}")
    @Produces(MediaType.APPLICATION_JSON)
     public boolean checkUsername(@PathParam("username") String username){
        return userServiceBean.checkUsername(username);
     }



}