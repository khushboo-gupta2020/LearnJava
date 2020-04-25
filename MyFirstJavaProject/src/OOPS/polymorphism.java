package OOPS;

 class calculate
{
	public void area(int side)
	{
		int sqarea=side* side;
		System.out.println("The area of square =  "+sqarea);
	}
	
	public double area(double side )
	{
		double rcarea = side * side;
		System.out.println("The area of rectangle is " + rcarea);
		return rcarea;
	}
}

public class polymorphism {

	public static void main(String[] args) {
		calculate c= new calculate();
		c.area(4);
		c.area(4.0);

	}

}
