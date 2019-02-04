import java.util.*;
class Shape{
	public void displayMag(){
		System.out.println("This is a Shape");
	}	
}
class Circle extends Shape{
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	double area(){
		return 3.14*radius*radius;
	}
	void displayarea(){
		System.out.println("Area of the Circle = "+area());
	}
}
class Rectangle extends Shape{
	int length, breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}

	double area(){
		return length*breadth;
	}
	void displayarea(){
		System.out.println("Area of Rectangle="+area());
	}
}
class Box extends Rectangle{
	int length;
	public Box(int length, int width, int heigth){
		this.length=length;
		this.width=width;
		this height=height;
	}

	public double volume(){
		return getLength()*getWidth()*height;
	}

	void displayarea(){
		System.out.println("Area of Box="+area());
		System.out.println("Volume of Box="+volume())
	}


}

class Inheritence{
	public static void main(String args[]){
		Circle c= new Circle(4);
		System.out.println("Circle Calling its function and inheritence");
		c.displayarea();
		c.displayMag();
		Rectangle r= new Rectangle(2,3);
		System.out.println("Rectangle calling its function and inheritence");
		r.displayarea();
		r.displayMag();
		Box b= new Box(2,3);
		System.out.println("Box Calling its function and inheritence");
		b.displayarea();
	}
}
