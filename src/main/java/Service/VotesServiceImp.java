package Service;

import DAO.VoteDAOLocal;
import Entity.Votes;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Remote
@Stateless
public class VotesServiceImp implements VotesServiceLocal {


    @EJB
    private VoteDAOLocal voteDAOLocalBean;


    public void addVote(Votes votes){
        voteDAOLocalBean.addVote(votes);
    }


    public void Vote( Integer constestant_id){
        Votes votes = voteDAOLocalBean.getContestantVote(constestant_id);
         Integer updateVote =  votes.getNumber_of_votes() + 1;
         votes.setNumber_of_votes(updateVote);
         voteDAOLocalBean.updateVote(votes);
    }


    public void  UnVote(Integer contestant_id) {
        Votes votes = voteDAOLocalBean.getContestantVote(contestant_id);
        Integer updateVote =  votes.getNumber_of_votes() - 1;
        votes.setNumber_of_votes(updateVote);
        voteDAOLocalBean.updateVote(votes);


    }


}
