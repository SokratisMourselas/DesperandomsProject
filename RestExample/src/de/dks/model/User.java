package de.dks.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class User implements Serializable {

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	@Id
	@Column(name="userId")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	
    @Column(name="username")
    private String username;
    
   
    @Column(name="password")
    private String password;
    
	
	@Column(name="email")
    private String email;
    
    @Column(name="age")
    private int age;
    
    @Column(name="gender")
    private String gender;

	public User(int userId, String username, String password, String email, int age, String gender) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
		this.gender = gender;
	}

	public User() {}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + "]";
	}
    
    
	

}
