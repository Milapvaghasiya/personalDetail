import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        int Number;
        Scanner scanner = new Scanner(System.in); // scanner for user data input
        System.out.println("\n Please Enter the any integer Value: ");
        Number = scanner.nextInt();

        if (Number >= 0) {
            System.out.println("\n You have entered POSITIVE Number");
        }
        else {
            System.out.println("\n You have entered NEGATIVE Number");
        }
    }
}
