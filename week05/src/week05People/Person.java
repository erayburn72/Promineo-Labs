package week05People;

public class Person {

	String firstName;
	String lastName;
	int age;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, int age) {
		
		if (age > 0 && age < 120) {
			this.age = age;
			this.firstName = firstName;
			this.lastName = lastName;
		} else {
			// do nothing, not a valid entry
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
