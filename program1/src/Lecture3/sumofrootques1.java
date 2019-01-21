import java.util.*;   
class sumofroot
{
	public static void main (String args[])
	{
	    Scanner s = new Scanner(System.in);
        System.out.println("Input the Value of x^2: ");
        double a = s.nextInt();
        System.out.println("Input the Value of x: ");
        double b = s.nextInt();
        System.out.println("Input the Constant: ");
        double c = s.nextInt();
        double d=(b*b)-4*a*c;
        if (d>0)
        {
        	double root1=((-b)+Math.sqrt(d)) /(2*a);
        	double root2=((-b)-Math.sqrt(d)) /(2*a) ;
        	System.out.println("root 1="+ root1);
        	System.out.println("root 2="+ root2);
        }
        else if (d==0)
        {
        	double root3=(-b) /(2*a);
        	System.out.println("both the roots are same i.e:"+root3);
        }
        else
        System.out.println("Error"); 	
        }
}