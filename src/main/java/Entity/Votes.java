package Entity;

import javax.persistence.*;
import java.io.Serializable;



@Entity
@Table(name = "votes")
public class Votes  implements Serializable{

	/**
	 * @Author: Marvelous Sylvester
	 * @Github: vester3500
	 * @Project: XML-Parsing-REST-API
	 **/

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    
    @Column(name = "number_of_votes")
    private  Integer number_of_votes;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contestent_id")
    private ContesttantEntity contestent;
    

	public Votes() {
		
	}

	public Votes(Integer id, Integer number_of_votes, ContesttantEntity contestent) {
		this.id = id;
		this.number_of_votes = number_of_votes;
		this.contestent = contestent;
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

	public ContesttantEntity getContestent() {
		return contestent;
	}

	public void setContestent(ContesttantEntity contestent) {
		this.contestent = contestent;
	}

	
	

	
}
