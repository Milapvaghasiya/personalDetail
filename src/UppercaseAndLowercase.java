import java.util.Locale;
import java.util.Scanner;

public class UppercaseAndLowercase {


    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in); // scanner for user data input
        System.out.println("enter the uppercase number");
        String userInputString=scanner.nextLine();
        System.out.println("enter the lowercase number"+userInputString.toLowerCase());
    }
}
