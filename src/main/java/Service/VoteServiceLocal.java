package Service;

import Entity.Votes;

public interface VoteServiceLocal {

    void addVoteService(Votes vote);
    void updateVoteService(Votes vote);
    void  makeVote(Integer contestant_id);

}
