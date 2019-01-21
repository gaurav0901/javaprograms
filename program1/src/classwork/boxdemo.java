import java.util.*;
class box
{
	Scanner s=new Scanner(System.in);
	double width;
	double height;
	double depth;
	void setDim()
	{
		
		System.out.println("Enter Width");
    	width=s.nextInt();
		System.out.println("Enter Height");
		height=s.nextInt();
		System.out.println("Enter Depth");
		depth=s.nextInt();
	}
	void volume(){
		System.out.println("Volume=" +(width*height*depth));
			}
}
class boxdemo
{
	public static void main(String arg[]){
	box b=new box();
	b.setDim();
	b.volume();
}
}