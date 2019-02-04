import java.util.Scanner;
class multicatch{
	public static void main(String args[]){
		try{
			int a,b,c;
			int[] d=[2];
			Scanner s=new Scanner(System.in);
			a=s.nextInt();
			System.out.println("a="+a);
			b=sc.nextInt();
			System.out.println("b="+b);
			c=a/b;
			d[2]=99;
		}
		catch(ArithmeticException e){
			System.out.println("Divide by 0:"+e);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array Index oob: "+ e)
		}
		System.out.println("After try/catch blocks:");
	}
}