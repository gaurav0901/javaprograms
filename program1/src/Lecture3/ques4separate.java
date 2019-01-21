import java.util.*;   
class Sprint
{
	public static void main (String args[])
	{
		String character;
		Scanner s =new Scanner(System.in);
    do{
    System.out.println("enter a five digit number");
    int a=s.nextInt();
    int b=a;
    int c=0;
    int result=0,x;
    while(b!=0)
	{ 
	b=b/10;
	c++;
	} 
	if(c==5)
	{
		while(a!=0)
		{
			x=a%10;
		    result =(result*10)+x;
		    a=a/10;
		}
		while(result!=0)
		{
			c=result%10;
			System.out.print(c+"   ");
			result=result/10;
		}
	}
	else
		System.out.println("Error");
     	System.out.println(" \n do you want to continue?(press No if no, press any kye ton continue.)");
	    input= s.next();
}
while (!(input.equals("No")));
}  
}