package Service;


import DAO.ContestantLocal;
import Entity.Contestants;

import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import java.util.Collection;

@Remote
@Stateless
public class ContestantServiceImpl implements  ContestantServiceLocal {


    @EJB
    ContestantLocal contestantLocalBean;

    public  void addContestantService(Contestants contestants) {

        contestantLocalBean.addContestant(contestants);
    }

    public void updateContentantService(Contestants contestants){
        contestantLocalBean.updateContestant(contestants);

    }

    public Collection<?> getAllContentantService() {
         return contestantLocalBean.getAllContestant();
    }


    //public   Contestants getContestantById(Integer id){
     // return contestantLocalBean.getContestantById(id);
     //}

}
