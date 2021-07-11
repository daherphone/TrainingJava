package section6;

public class Person {//firstName, lastName of type String and age of type int. 
	private String firstName, lastName; 
	private int age;
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
		if(age<0 || age>100)this.age=0;
		else
		this.age = age;
	}
//	*Method named isTeen without any parameters, it needs to return true if the value of the age field is greater than 12 and less than 20, otherwise, return false.
	public boolean isTeen() {
		if(age>12 && age<20)return true;
		return false;
	}
	//			*Method named getFullName without any parameters, it needs to return the full name of the person.
	public String getFullName() {
		if(firstName.isEmpty())return this.getLastName();
		if(lastName.isEmpty())return this.getFirstName();
		return firstName+ " "+lastName;
	}
	//			    *In case both firstName and lastName fields are empty, Strings return an empty String.
//			    *In case lastName is an empty String, return firstName.
//			    *In case firstName is an empty String, return lastName.
//			    
//			To check if s String is empty, use the method isEmpty from the String class. For example, firstName.isEmpty() returns true if the String is empty or in other words, when the String does not contain any characters.


}
