import java.util.Scanner;

public class EnterAnyNumber {
    public static void main(String []args){
        int one,two, number,subtract,multiply;
        float devided;
        Scanner scanner=new Scanner(System.in);  // scanner for user input
        one =scanner.nextInt();
        two =scanner.nextInt();
        number = one + two;
        subtract = one - two;
        multiply = one * two;
        devided = (float) one/two; // as per user input output should be printed
        System.out.println("addition ="+number);
        System.out.println("subtraction="+ subtract);
        System.out.println("multification ="+multiply);
        System.out.println("division ="+devided);





    }
}
