package Service;


import DAO.ContestantDAOLocal;
import Entity.Contestants;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.Collection;

@Remote
@Stateless
public class ContestantService implements  ContestantLocalService {


    @EJB
    private ContestantDAOLocal contestantDAOLocalBean;


    public void addContestantService(Contestants contestants) {
        contestantDAOLocalBean.addContestant(contestants);
    }

    public  void updateContestantService(Contestants contestants){
        contestantDAOLocalBean.updateContestant(contestants);
    }


    public  Contestants getContestantById(Integer contestant_id){

         return contestantDAOLocalBean.getContestantById(contestant_id);
    }

    public Collection<?> getAllContestant() {
        return contestantDAOLocalBean.getAllContestant();
    }


}
