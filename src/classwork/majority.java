import java.util.*;
class majority{
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int i,j;
        int count=0;
        System.out.println("Enter the Size of Array");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter Elements of Arrays");
        for(i=0 ;i<size; i++){              //Inputting the Value of Array
            arr[i]=s.nextInt();
        }
        System.out.println("Inputted Arrays are");
        for(i=0;i<size;i++){                //Displaying the Array
            System.out.println(+arr[i]);
        }
        for(i=0;i<size;i++){                //Finding Majority Elements
            for(j=0;i<size;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>(size/2)){
                System.out.println("Majority Element"+i"=")
                System.out.println(arr[i]);
                count=0;
                }
            else{
                    count=0;
                
                }
        }
    }
}