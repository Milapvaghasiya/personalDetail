import java.util.Scanner;

public class CityName {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in); // scanner for user data input
        System.out.println("enter any alphabet");
        char city=scanner.next().charAt(0);
       // appling if else condition meet requirement
        if(city=='a')
        {
            System.out.println("ahmedabad");
        }

        else if(city=='b')
        {
            System.out.println("baroda");
        }
        else if(city=='c')
        {
            System.out.println("canada");

        }
        else if(city=='d')
         {
             System.out.println("delhi");
        }
        else if(city=='e')
        {
            System.out.println("elilangabadd");
        }
        else if(city=='f')
        {
            System.out.println("fameda");
        }
    }
}
