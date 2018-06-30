package Entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "votes")
public class Votes  implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name = "number_of_votes")
    private  Integer number_of_votes;


    @OneToMany(cascade = CascadeType.ALL)
    @Column(name = "contestant_id")
    @JoinColumn(name = "contestant_id", referencedColumnName = "contestant_id" )
    private  ContesttantEntity contesttant;

    public Votes() {
    }

    public Votes(Integer id, Integer number_of_votes, ContesttantEntity contesttant) {
        this.id = id;
        this.number_of_votes = number_of_votes;
        this.contesttant = contesttant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumber_of_votes() {
        return number_of_votes;
    }

    public void setNumber_of_votes(Integer number_of_votes) {
        this.number_of_votes = number_of_votes;
    }

    public ContesttantEntity getContesttant() {
        return contesttant;
    }

    public void setContesttant(ContesttantEntity contesttant) {
        this.contesttant = contesttant;
    }
}
