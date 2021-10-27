import java.io.StringReader;
import java.util.Scanner;

public class Cityprint
{
    public static void main(String []args)

    {
        Scanner scanner=new Scanner(System.in); // scanner for user data input

        System.out.println("Enter number");

        int num= scanner.nextInt();
       // applying if else condition
        if(num==1)
        {
            System.out.println("Monday...");
        }


        else if(num==2)
        {
            System.out.println("Tuesday...");
        }
        else if(num==3)
        {
            System.out.println("Wednesday...");
        }
        else if(num==4)
        {
            System.out.println("Thursday...");
        }
        else if(num==5)
        {
            System.out.println("Friday...");
        }
        else if(num==6)
        {
            System.out.println("saturday...");
        }
        else if(num==7)
        {
            System.out.println("its sunday...");
        }
    }
}

