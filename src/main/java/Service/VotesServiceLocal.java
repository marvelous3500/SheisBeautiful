package Service;

import Entity.Votes;

import javax.ejb.Remote;

@Remote
public interface VotesServiceLocal {
    void addVote(Votes votes);

     void Vote ( Integer constestant_id);

    void  UnVote (Integer contestant_id);

}
