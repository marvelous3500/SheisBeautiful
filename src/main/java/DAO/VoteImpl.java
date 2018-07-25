package DAO;


import Entity.Votes;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Remote
@Stateless
public class VoteImpl  implements Votelocal{

    @PersistenceContext
     private EntityManager em;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void addVote(Votes votes){
        em.persist(votes);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void  updateVote(Votes votes){
        em.merge(votes);
    }

    public  void makeVote(Integer contestant_id) {

        Votes vote = em.find(Votes.class, contestant_id);
        Integer updateVote = vote.getNumber_of_votes() + 1;
        vote.setNumber_of_votes(updateVote);
        em.merge(vote);
        em.flush();

    }
}
