import java.util.Scanner;
class ExceptionExample1{
	public static void main(String[]args){
	int a;
	int b;
	int c;
	Scanner sc = new Scanner(System.in);
	System.out.print("\n enter the value of a");
	a=sc.nextInt();
	try{
	
	System.out.print("\n enter the value of b");
b=sc.nextInt();

c=a/b;
System.out.print("\na="+a +"b="+b+"a/b="+c);
} 

catch(ArithmeticException e){
	System.out.print("ArithmeticException" +e);
	

}


	
	finally{
		System.out.print("infinally");
	}

}
}

