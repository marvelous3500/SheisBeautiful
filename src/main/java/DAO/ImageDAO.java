package DAO;
import Entity.Image;
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
public class ImageDAO implements  ImageDAOLocal {

    @PersistenceContext
    EntityManager em;


    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void addImage (List<Image> images){
        for( Image image : images ){
           em.persist(image);
        }
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public Collection<?> getAllImageOfContestantByContestantId(Integer contestant_id){

        return (List<Image>) em.createQuery("SELECT i.path FROM Image i WHERE i.contestant_id=:contestant_id")
                .setParameter("contestant_id", contestant_id).getResultList();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void  DeleteContestantImage(Integer image_id){


    }
}
