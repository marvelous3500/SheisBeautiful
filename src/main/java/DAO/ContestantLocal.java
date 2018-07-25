package DAO;

import Entity.Contestants;

import javax.ejb.Remote;
import java.util.Collection;


@Remote
public interface ContestantLocal {

    public  void addContestant(Contestants contestants);

    public  void updateContestant(Contestants contestants);

    public Collection<?> getAllContestant();

    //public Contestants getContestantById (Integer id );

}
