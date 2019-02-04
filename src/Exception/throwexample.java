import java.utitl.Scanner;
class throwexample{
	public static void main(String[] args){
		int day;
		boolean flag=true;
		Scanner s = new Scanner(System.in);
		while(flag)
		{	
			System.out.print("Enter Day:")
			try{
				System.out.print("Enter day: ")
				day=sc.nextInt();
				if(day=1 || day=31)
					throw new Exception("Exception: Invalid");
				else 
				{
					System.out.print("\n Entered Day="+day);
					flag=false
				}
		}
			catch(Exception e){
				System.out.print(e.toString());
		}
			finally{
				System.out.print("Finally");
		}
	}
}