package Service;

import DAO.Votelocal;
import Entity.Votes;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;


@Remote
@Stateless
public class VoteServiceImpl implements VoteServiceLocal {

    @EJB
    private Votelocal votelocalBean;

    public  void addVoteService(Votes vote){

        votelocalBean.addVote(vote);

    }

    public void updateVoteService(Votes vote){
        votelocalBean.updateVote(vote);

    }

    public  void  makeVote(Integer contestant_id){

     votelocalBean.makeVote(contestant_id);
    }

}
