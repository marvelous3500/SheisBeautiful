package Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * @author marvelous 
 * 
 * Entity used to create  user to the database  
 *
 */

@Entity
@Table(name = "user")
public class User implements Serializable{


	private static final long serialVersionUID = -3272921461487563688L;

	@Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private  Long id;

    @Column(name = "username")
    private  String username;

    @Column(name= "email")
    private  String email;  
    

    @Column(name = "password")
    private  String password;


    @Column(name  = " isactive")
	private  boolean isactive;


	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	private Contestants contestants;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "user")
	private Role role;


	public User() {
	}

	public User(Long id, String username, String email, String password, boolean isactive, Contestants contestants, Role role) {
		this.id = id;
		this.username = username;
		this.email = email;
		this.password = password;
		this.isactive = isactive;
		this.contestants = contestants;
		this.role = role;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public Contestants getContestants() {
		return contestants;
	}

	public void setContestants(Contestants contestants) {
		this.contestants = contestants;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
