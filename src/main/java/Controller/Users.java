package Controller;

import Entity.UserEntity;
import Service.UserLocal;
import javax.ejb.EJB;
import javax.websocket.server.PathParam;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;


@Path("/users")
public class Users {

    @EJB
     private UserLocal usersEJB;

    @POST
    @Path("/addUser/{username}/{password}/{email}")
    @Consumes(MediaType.APPLICATION_JSON)
    public  void addUsers (UserEntity user, @PathParam("username") String username, @PathParam("password") String password, @PathParam("email") String email ) {
         usersEJB.adduser(user);

    }

    @GET
    @Path("/getUserByUsername/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public UserEntity getUserByUsername (@PathParam("username") String username) {
        return usersEJB.getUserByUsername(username);
    }

    @GET
    @Path("/getUsernameById/{Useer_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public  UserEntity getUserById(@PathParam("id") Integer id){
        return usersEJB.getUserById(id);
    }

    @GET
    @Path("/checkUser/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Boolean checkUser(@PathParam("username") String username){
        return  usersEJB.checkusername(username);
    }

    @GET
    @Path("/login/{username}/{password}")
    @Produces(MediaType.APPLICATION_JSON)
    public  Boolean validateUser (@PathParam("username") String username, @PathParam("password") String password ) {
        return usersEJB.validateUser(username, password);
    }


    @GET
    @Path("/getAllUsers")
    public Collection<?> getAllUsers(){
        return usersEJB.getAllUsers();
    }

}
