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
@Table(name = "Contestant")
public class Contestants implements Serializable {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer contestant_id;

    @Column(name = "firstname")
    private  String firstname;

    @Column(name= "lastname")
    private  String lastname;

    @Column(name = "nikename")
    private  String nikename;

    @Column(name = "phone_number")
    private  Integer phone_number;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private  User user;

    public Contestants() {
    }

    public Contestants(Integer contestant_id, String firstname, String lastname, String nikename, Integer phone_number, User user) {
        this.contestant_id = contestant_id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nikename = nikename;
        this.phone_number = phone_number;
        this.user = user;
    }

    public Contestants(String firstname, String lastname, String nikename, Integer phone_number) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nikename = nikename;
        this.phone_number = phone_number;
    }

    public Contestants(User user) {
        this.user = user;
    }

    public Integer getContestant_id() {
        return contestant_id;
    }

    public void setContestant_id(Integer contestant_id) {
        this.contestant_id = contestant_id;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
