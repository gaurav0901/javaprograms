import java.util.*;
class box
{
	Scanner s=new Scanner(System.in);
	double width;
	double height;
	double depth;
		
		box(){
			width=9;
			height=9;
			depth=9;
		}
		box(double width,double height, double depth){
			this.width=width;
			this.height=height;
			this.depth=depth;
		}
	void volume(){
		System.out.println("Volume=" +(width*height*depth));
			}
}
class boxdemo
{
	public static void main(String arg[]){
	box b=new box();
	b.volume();
	box b1=new box(1,2,3);
	b1.volume();
}
}