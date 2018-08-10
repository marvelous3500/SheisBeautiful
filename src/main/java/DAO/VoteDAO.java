package DAO;

import Entity.Votes;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class VoteDAO implements  VoteDAOLocal {


    @PersistenceContext
    EntityManager em ;


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void  addVote(Votes votes){
        em.persist(votes);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Votes  getContestantVote(Integer contestant_id){

      return (Votes) em.createQuery("SELECT v.number_of_votes FROM Votes  v  WHERE  v.contestant_id=: contestant_id ")
                .setParameter("contestant_id", contestant_id).getSingleResult();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void updateVote(Votes votes){
        em.merge(votes);
    }

}

