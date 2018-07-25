package Controller;


import Entity.Votes;
import Service.VoteServiceLocal;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/vote")
public class VoteControler {

    @EJB
    private VoteServiceLocal voteServiceLocalBean;

    @POST
    @Path("/addvote")
    @Consumes(MediaType.APPLICATION_JSON)
    public  void addvote(Votes vote){

        voteServiceLocalBean.addVoteService(vote);
    }


    @POST
    @Path("updateVote")
    @Consumes(MediaType.APPLICATION_JSON)
    public void updateVotes(Votes votes){
        voteServiceLocalBean.updateVoteService(votes);

    }

    @GET
    @Path("/makevote{constant_id}")
    @Produces(MediaType.APPLICATION_JSON)
    public  void  makeVote(  @PathParam("Contestant_id") Integer contestant_id){

        voteServiceLocalBean.makeVote(contestant_id);
    }


}
