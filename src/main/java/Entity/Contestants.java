package Entity;

import javax.jms.JMSPasswordCredential;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: Marvelous Sylvester
 * @Github: vester3500
 * @Project: XML-Parsing-REST-API
 **/


@Entity
@Table(name = "Contestant")
public class Contestants implements Serializable {


	@Id
    private  Integer id;
    @Column(name = "firstname")
    private  String firstname;

    @Column(name= "lastname")
    private  String lastname;

    @Column(name = "nikename")
    private  String nikename;

    @Column(name = "phone_number")
    private  Integer phone_number;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "contestant_id")
    private  List <Image> image ;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name =  "contestant_id", nullable = false)
    private User user;



    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "contestant_vote_id")
    private List<Votes> votes;

    public Contestants() {
    }

    public Contestants(Integer id, String firstname, String lastname, String nikename, Integer phone_number, List<Image> image, User user, List<Votes> votes) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nikename = nikename;
        this.phone_number = phone_number;
        this.image = image;
        this.user = user;
        this.votes = votes;
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

    public List<Image> getImage() {
        return image;
    }

    public void setImage(List<Image> image) {
        this.image = image;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Votes> getVotes() {
        return votes;
    }

    public void setVotes(List<Votes> votes) {
        this.votes = votes;
    }
}
