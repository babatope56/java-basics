package classesAndObjects;

//Class declaration
public class Box {

	//Fields (object instantiation)
	private double length; //unit: inches
	private double depth; //unit: inches
	private double height; //unit: inches
	private double cost; //unit: inches squared
	
	//Constructors (declaration of class)
	public Box() {
		super();
	}
	
	public Box(double length, double depth, double height, double cost) {
		super();
		this.length = length;
		this.depth = depth;
		this.height = height;
		this.cost = cost;
	}
	
	
	//Properties
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getDepth() {
		return depth;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	//Method: Box volume calculation
	public double getVolume(double length, double depth, double height) {
		
		double volume = length * depth * height;
		return volume;
	}
	
	//Method: Box surface area calculation
	public double getSurfaceArea(double length, double depth, double height) {
		
		double surfaceArea = 2 * ((length * depth) + (length * height) + (depth * height));
		return surfaceArea;
	}
	
	//Method: Box cost calculation
	public double getTotalCost(double cost, double length, double depth, double height) {
		
		//Call method
		double surfaceArea = getSurfaceArea(length, depth, height);
		
		double totalCost = cost * surfaceArea;
		return totalCost;
	}

}
