package DAO;


import Entity.Contestants;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

@Remote
@Stateless
public class ContestantDOA implements ContestantDAOLocal {

    @PersistenceContext

    EntityManager em;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void addContestant (Contestants contestants){

        em.persist(contestants);
    }


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  void updateContestant(Contestants contestants){

        em.merge(contestants);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Collection<?> getAllContestant (){

        return  (List<Contestants> ) em.createQuery("from Contestants").getResultList();
    }


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public  Contestants getContestantById(Integer contestant_id) {

        return  (Contestants) em.createQuery("SELECT  c  FROM Contestant c  WHERE  c.contestant_ide=:contestant_id").setParameter("contestant_id", contestant_id).getSingleResult();
    }





}
