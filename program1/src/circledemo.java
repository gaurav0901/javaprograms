import java.util.*;
class Circle{
	
		double radius;
		double findarea()
		{
			return radius*radius*3.14;

		}
		void displayarea()
		{
			System.out.println("Area="+findarea());
		}
	}
class circledemo{
	public static void main(String arg[])
	{
		Scanner s=new Scanner(System.in);
		Circle c=new Circle();
		System.out.println("Enter Radius");
		int rad=s.nextInt();
		c.radius=rad;
		c.displayarea();
	}
}
