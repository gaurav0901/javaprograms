import java.util.Scanner;
class exceptioncatch{
	public static void main(String[] args){
		int a,b,c;
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the value of a");
		a=s.nextInt();
		System.out.println("Enter the Value of b");
	try{
		b=s.nextInt();
		c=a/b;
	}catch(ArithmeticException e){
		System.out.println("bye");
		b=1;
	}
	catch(Exception e){
		System.out.println("Hello");
		b=1;
	}
	
	c=a/b;
		System.out.println("a/b="+c);
		}
	}