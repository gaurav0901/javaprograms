import java.util.*;
class practice
{
	public static void main(String args[])
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		a=s.nextInt();
		if(a%2==0)
		{
			a=a*2;
			System.out.println(+a);
		}
		else
		{
			System.out.println(+a);
		}

		}
}