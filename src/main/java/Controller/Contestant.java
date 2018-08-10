package Controller;
import Entity.Contestants;
import Service.ContestantLocalService;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.awt.*;
import java.util.Collection;


@Path("/contestant")
public class Contestant {

    @EJB
     private ContestantLocalService contestantLocalServiceBean;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/addcontestant")
    public  void  addContestant(Contestants contestants){

        contestantLocalServiceBean.addContestantService(contestants);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/updatecontstant")
    public  void updateContestant (Contestants contestants){

        contestantLocalServiceBean.updateContestantService(contestants);
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getallcontestant")
    public Collection<?> getAllContestant(){
         return contestantLocalServiceBean.getAllContestant();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getcontestantbyid/{contestant_id}")
    public Contestants getContestantById( @PathParam("contestant_id") Integer contestant_id){
        return contestantLocalServiceBean.getContestantById(contestant_id);
    }






}
