import java.util.Scanner;

public class EmployerSalary {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in); // scanner for user data input
        System.out.println("Enter the name of employee"); //declaring  all relevant variable
        String name=scanner.nextLine();

        System.out.println("enter the id ");
        int id=scanner.nextInt();

        System.out.println("enter the Salary ");
        int salary=scanner.nextInt();
       // applying given requirement
        int hra=(10*salary)/100;
        int ta=(9*salary)/100;
        int da=(8*salary)/100;

        int pf=(20*salary)/100;
       // outcome of calculation
        int grosssalary=(hra+ta+da-pf);
        System.out.println("the gross salary is "+grosssalary);
    }
}
