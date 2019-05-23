package classesAndObjects;

public class Variables {

	public static void main(String[] args) {

		Person.setDepartment("Information Tech");

		//Creates an object p of type Person
		Person p = new Person("John", 10, 'm');

		System.out.println(p);

		//Assigns value to p, using setters	
		Person p1 = new Person();
		p1.setAge(20);
		p1.setName("Kayla");
		p1.setGender('f');

		System.out.println(p1);

		p1.sayHi();
	}
}
