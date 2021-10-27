import java.util.Scanner;

public class OddEven {
    public void findOdd()

    {
        Scanner scanner = new Scanner(System.in); // scanner for user data input
        System.out.println("please enter first number  ");
        int number = scanner.nextInt();
        System.out.println("please enter second number  ");
        int number2 = scanner.nextInt();



        //use ternary operator to check Odd or Even

        String name = number %2==0 ?  "even ": "odd";
        System.out.println(number+"is"+name);

        String name1 = number2 %2==0 ?  "even ": "odd";
        System.out.println(number2+"is"+name1);




    }
    public static void main(String[] args) {
        OddEven oddEven=new OddEven();
           oddEven.findOdd();
    }





}
