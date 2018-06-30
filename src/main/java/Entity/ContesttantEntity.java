package Entity;

import javax.persistence.*;
import java.io.Serializable;

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


    //@Column(anme= "image_id")
    //private  ImageEntity image ;

    @OneToOne()
    @Column(name= "id")
    @JoinColumn(name= "id", referencedColumnName = "id")
    private  UserEntity user;


    public ContesttantEntity() {

    }

    public ContesttantEntity(Integer id, String firstname, String lastname, String nikename, Integer phone_number, UserEntity user) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.nikename = nikename;
        this.phone_number = phone_number;
        this.user = user;
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

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
