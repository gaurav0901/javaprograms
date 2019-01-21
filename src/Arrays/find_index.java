import java.util.Scanner;
public class find_index {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int i;
		boolean f;
		int arr[] = new int[10];
		System.out.println("Enter 10 elements of array: ");
		for(i=0;i<10;i++){
			arr[i] = in.nextInt();
		}
		System.out.println("Enter a number to search index: ");
		int num = in.nextInt();
		System.out.println("Array= ");
		for(i=0;i<10;i++){
			System.out.println(arr[i]);
		}
		for(i=0;i<10;i++){
			if(arr[i]==num){
				System.out.println("Index of element= "+ i);
				f=true;
				break;
			}
		}
		if(f=false){
			System.out.println("Not a valid index number.");
		}
	}
}
