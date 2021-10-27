import java.util.Scanner;

public class InterchangeValue5 {

    public static void main (String []args)
    {
        Scanner scanner=new Scanner(System.in); // scanner for user data input
        System.out.println("Enter First1 ");
        int nub1= scanner.nextInt();
        System.out.println("enter second2");
        int nub2=scanner.nextInt();
        int ans=nub1;
        nub1=nub2;
        nub2=ans;
        System.out.println("number1 is"+nub1);
        System.out.println("number2 is"+nub2);



    }

}

