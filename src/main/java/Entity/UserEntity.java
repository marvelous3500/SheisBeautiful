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
@Table(name = "user")
public class UserEntity  implements Serializable{


	private static final long serialVersionUID = -3272921461487563688L;

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

    private  ContesttantEntity contesttant;

    public UserEntity() {
    }
    
    

	public UserEntity(long id, String username, String email, String password, String role,
			ContesttantEntity contesttant) {

		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		Role = role;
		this.contesttant = contesttant;
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

	public ContesttantEntity getContesttant() {
		return contesttant;
	}

	public void setContesttant(ContesttantEntity contesttant) {
		this.contesttant = contesttant;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
}
