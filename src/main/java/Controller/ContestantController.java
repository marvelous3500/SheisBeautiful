package Controller;


import Entity.Contestants;
import Service.ContestantServiceLocal;


import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/contestant")
public class ContestantController {

    @EJB
    private ContestantServiceLocal contestantServiceLocalBean;

    @POST
    @Path("/addcontestant")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addcontestant (Contestants contestants){

        contestantServiceLocalBean.addContestantService(contestants);

    }

    @POST
    @Path("/updatecontestant")
    @Consumes(MediaType.APPLICATION_JSON)
    public  void  updateContestantService(Contestants contestants){

        contestantServiceLocalBean.updateContentantService(contestants);
    }


    @GET
    @Path("getallcontestant")
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<?>getAllContestant(){
         return contestantServiceLocalBean.getAllContentantService();
    }

//
//    @GET
//    @Path("/getcontestantbyid")
//    @Produces(MediaType.APPLICATION_JSON)
//    public  Contestants getContestantById(Integer id){
//
//        return contestantServiceLocalBean.getContestantById(id);
//    }

}


