package Controller;

import Entity.User;
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
    @Path("/adduser")
    @Consumes(MediaType.APPLICATION_JSON)
    public  void addUsers (User user) {
         usersEJB.adduser(user);

    }

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public String Test (){
        return "am testing the app and it work";
    }

    @GET
    @Path("/getuserByUsername/{username}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserByUsername (@PathParam("username") String username) {
        return usersEJB.getUserByUsername(username);
    }

    @GET
    @Path("/getusernameById/{Useer_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUserById(@PathParam("id") Integer id){
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
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<?> getAllUsers(){
        return usersEJB.getAllUsers();
    }


    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public  void UpdateUser (User user){
        usersEJB.updateUser(user);
    }

}
