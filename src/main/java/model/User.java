package model;

public class User {
	
	private String firstName, secondName, email, password, id;
	private int age;
	
	public User(String firstName, String secondName, String email, String password, String id, int age){
		this.firstName = firstName;
		this.secondName = secondName;
		this.email = email;
		this.password = password;
		this.id = id;
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}
	
	public String getId() {
		return id;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", secondName=" + secondName + ", email=" + email + ", password="
				+ password + ", age=" + age + "]";
	}
}
