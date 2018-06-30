package Entity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name = "user")
public class UserEntity  implements Serializable{

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private  long id;

    @Column(name = "username")
    private  String username;

    @Column(name= "email")
    private  String email;

    @Column(name = "password")
    private  String password;

    @Column(name = "role")
    private   String Role;

    public UserEntity(long id, String username, String email, String password, String role, Boolean user_is_active) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        Role = role;
        this.user_is_active = user_is_active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public Boolean getUser_is_active() {
        return user_is_active;
    }

    public void setUser_is_active(Boolean user_is_active) {
        this.user_is_active = user_is_active;
    }

    @Column(name = "user_is_active")
    private  Boolean user_is_active;

    public UserEntity() {
    }


}
