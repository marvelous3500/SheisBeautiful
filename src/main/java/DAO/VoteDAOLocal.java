package DAO;


import Entity.Votes;

import javax.ejb.Remote;

@Remote
public interface VoteDAOLocal {

    void addVote(Votes votes);

    Votes getContestantVote(Integer contestant_id);

    void updateVote(Votes votes);
}
