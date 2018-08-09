package Service;


import Entity.Contestants;

import javax.ejb.Remote;
import java.util.Collection;

@Remote
public interface ContestantLocalService {

    void addContestantService(Contestants contestants);

    void updateContestantService(Contestants contestants);

    Contestants getContestantById(Integer contestant_id);

    Collection<?> getAllContestant();
}
