package Service;

import Entity.Contestants;

import javax.ejb.Remote;
import java.util.Collection;

@Remote
public interface ContestantServiceLocal {

    public  void addContestantService(Contestants contestants);

    public  void updateContentantService(Contestants contestants);

    public Collection<?> getAllContentantService();

    //Contestants getContestantById(Integer id);

}
