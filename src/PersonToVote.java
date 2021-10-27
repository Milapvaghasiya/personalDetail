import java.util.Scanner;

public class PersonToVote {
    public static void main(String [] atgs)
    {
        Scanner scanner=new Scanner(System.in); // scanner for user data input

        System.out.println("enter the age");
        int age=scanner.nextInt();

        if(age>=18)
        {
            System.out.println("eligible for vote");
        }
        else
        {
            System.out.println("not eligible for vote");
        }

    }
}
