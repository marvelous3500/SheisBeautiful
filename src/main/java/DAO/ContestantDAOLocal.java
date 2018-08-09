package DAO;

import Entity.Contestants;

import javax.ejb.Remote;
import java.util.Collection;

@Remote
public interface ContestantDAOLocal {

    void addContestant(Contestants contestant);

    void updateContestant(Contestants contestant);

    public  Collection<?> getAllContestant();

    Contestants getContestantById(Integer contestant_id);
}
