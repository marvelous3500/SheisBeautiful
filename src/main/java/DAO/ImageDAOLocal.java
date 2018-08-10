package DAO;

import Entity.Image;

import javax.ejb.Remote;
import java.util.Collection;
import java.util.List;

@Remote
public interface ImageDAOLocal {


    void addImage(List<Image> image);

    Collection<?> getAllImageOfContestantByContestantId(Integer contestant_id);

    void  DeleteContestantImage(Integer image_id);


}
