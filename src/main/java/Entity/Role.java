package Entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class Role implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id ;

    @Column(name = "role")
    private String Role;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "role_id")
    private  User user ;

    public Role() {

    }

    public Role(Integer id, String role, User user) {
        this.id = id;
        Role = role;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}




