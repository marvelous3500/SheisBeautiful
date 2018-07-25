package DAO;


import Entity.Contestants;

import javax.ejb.*;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.List;

@Remote
@Stateless
public class ContestantImpl implements ContestantLocal {

    @PersistenceContext
    private EntityManager em;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void addContestant(Contestants contestants) {

        em.persist(contestants);
    }


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void updateContestant(Contestants contestants) {

        em.merge(contestants);

    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Collection<?> getAllContestant() {

        return (List<Contestants>) em.createQuery("from Contestants").getResultList();

    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Contestants getcontestantById(Long id) {
        return (Contestants) em.createQuery("SELECT c FROM Contestants c WHERE c.id =:id;").setParameter("id", id).setMaxResults(1).getSingleResult();
    }

}
