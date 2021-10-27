import java.util.Scanner;

public class AvrageNumber {
    public static void main(String [] args)
    {

        Scanner scanner=new Scanner(System.in); // scanner for user entry
        System.out.println("Enter the first number");
        int num1= scanner.nextInt();

        System.out.println("Enter the second number");
        int num2= scanner.nextInt();
        System.out.println("Enter the Third number");
        int num3= scanner.nextInt();
        System.out.println("Enter the forth number");
        int num4= scanner.nextInt();
        System.out.println("Enter the five number");
        int num5= scanner.nextInt();
       // adding all number together
        int  total=num1+num2+num3+num4+num5;
        System.out.println("the total is:"+total);
        int avg=total/5;
        System.out.println("the average is:-"+avg);




    }
}
