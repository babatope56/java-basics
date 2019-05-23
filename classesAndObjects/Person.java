package classesAndObjects;

//Class declaration
public class Person {

	//Object instantiation --> manual entry
	private String name;
	private int age;
	private char gender;
	private int id;
	
	private static String department = "IT";
	private static int count= 1;
	
	
	//Constructor declaration of class (parameterized) --> Go to Source > Generate Constructor using fields
	public Person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.id= count;
		count++;
	}
	
	//Constructor declaration of class (empty) --> do not go to Source to create an empty constructor, do not need super() bc not passing anything through
	public Person() {
		this.id = count;
		count++;
	}
	
	//Method 1 --> Go to Source > Generate Getters & Setters
	public String getName() {
		return name;
	}
	//Method 2
	public void setName(String name) {
		this.name = name;
	//Method 3
	}
	public int getAge() {
		return age;
	//Method 4
	}
	public void setAge(int age) {
		this.age = age;
	//Method 5
	}
	public char getGender() {
		return gender;
	//Method 6
	}
	public void setGender(char gender) {
		this.gender = gender;
	//Method 7
	}
	
	//Output 1
	public static String getDepartment() {
		return department;
	}
	//Output 2
	public static void setDepartment(String department) {
		Person.department = department;
	}
	//Output 3
	public void sayHi()
	{
	System.out.println("Hi "+name);
	}
	
	//Output 4 --> Go to Source > Generate toString()
	@Override
	public String toString() {
		return "Name=" + name + ", age=" + age + ", gender=" + gender+" Department="+department+" id "+this.id;
	}
}