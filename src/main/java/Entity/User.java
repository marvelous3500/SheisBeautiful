package Entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * @author marvelous 
 * 
 * Entity used to create  user to the database  
 *
 */

@Entity
@Table(name = "User")
public class User implements Serializable{


	private static final long serialVersionUID = -3272921461487563688L;

	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private  long user_id;

    @Column(name = "username")
    private  String username;

    @Column(name= "email")
    private  String email;  
    

    @Column(name = "password")
    private  String password;


    public User() {
    }

	public User(long user_id, String username, String email, String password) {
		this.user_id = user_id;
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public User(String username,  String password) {
		this.username = username;
		this.password = password;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
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
}
