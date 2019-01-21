import java.util.Scanner;
public class float_check2 {

    
  public static void main(String[] args)
    {
        int num1;
        int num2;
        Scanner in = new Scanner(System.in);

        System.out.print("Input first floating-point number: ");
        double x = in.nextDouble();
        System.out.print("Input second floating-point number: ");
        double y = in.nextDouble();
        num1 = (int)x*1000;
        num2 = (int)y*1000;
       
        if (num1 == num2)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
