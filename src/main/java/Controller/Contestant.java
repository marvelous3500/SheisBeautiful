package Controller;


import Entity.Contestants;
import Service.ContestantLocalService;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.awt.*;


@Path("/contestant")
public class Contestant {

    @EJB
    ContestantLocalService contestantLocalServiceBean;


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





}
