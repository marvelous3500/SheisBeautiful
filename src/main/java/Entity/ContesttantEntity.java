package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: Marvelous Sylvester
 * @Github: vester3500
 * @Project: XML-Parsing-REST-API
 **/


@Entity
@Table(name = "contestant")
public class ContesttantEntity implements Serializable {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;

    @Column(name = "firstname")
    private  String firstname;

    @Column(name= "lastname")
    private  String lastname;

    @Column(name = "nikename")
    private  String nikename;

    @Column(name = "phone_number")
    private  Integer phone_number;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "contestant_id")
    private  List <ImageEntity> image ;

    
    @OneToOne(cascade = CascadeType.ALL)
    private  UserEntity user;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Votes> votes;

	public ContesttantEntity(Integer id, String firstname, String lastname, String nikename, Integer phone_number,
			List<ImageEntity> image, UserEntity user, List<Votes> votes) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nikename = nikename;
		this.phone_number = phone_number;
		this.image = image;
		this.user = user;
		this.votes = votes;
	}  
	
	public ContesttantEntity() {
		}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getNikename() {
		return nikename;
	}

	public void setNikename(String nikename) {
		this.nikename = nikename;
	}

	public Integer getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(Integer phone_number) {
		this.phone_number = phone_number;
	}

	public List<ImageEntity> getImage() {
		return image;
	}

	public void setImage(List<ImageEntity> image) {
		this.image = image;
	}

	public UserEntity getUser() {
		return user;
	}

	public void setUser(UserEntity user) {
		this.user = user;
	}

	public List<Votes> getVotes() {
		return votes;
	}

	public void setVotes(List<Votes> votes) {
		this.votes = votes;
	}
	
	
   
   
}
