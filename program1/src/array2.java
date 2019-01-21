import java.util.*;
class array2
{
	public static void main(String arg[]){
	Scanner s=new Scanner(System.in);
	int arr[]=new int[10];
	System.out.println("Enter Elements of Arrays");
	int i=0;
	for(i=0 ;i<10; i++)
	{
		arr[i]=s.nextInt();
	}
    System.out.println("Enter the Number to be Searched");
    int num=s.nextInt();
    search(arr,num);
    

}
	static void search(int arr[],int num)
	{
		int a=0;
		for(int j=0;j<10;j++)
		{
			if(arr[j]==num)
			{
				a=1;
				System.out.println("Element Found at:"+(j+1));
				break;
			}

		}
	if(a==0)
	{
		System.out.println("Element not found");
	}
	}
}
