import java.util.Scanner;
public class search_function{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int [] a = new int[10];
		int item;
		System.out.print("Enter the elements of the Array");
		for(int i=0;i<a.length;i++){
			a[i] = in.nextInt();
		}
		System.out.println("Enter the item to search");
		item = in.nextInt();
		int loc = search(a, item);
		if(loc==1)
			System.out.print("Item not in list.");
		else
			System.out.print("Item at location " + loc);
	}
		static inr search(int[]a, int item){
     		int i;
    		for(i=0;i<a.length;i++){
    			if(item==a[i])
    		}
	}

}