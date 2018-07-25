package DAO;


import Entity.Votes;

import javax.ejb.Remote;
import java.util.Collection;

@Remote
public interface Votelocal {

    public void addVote(Votes vote);

    public  void updateVote(Votes vote);

    void makeVote( Integer contestsnt_id);


}
