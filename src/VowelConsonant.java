import java.util.Scanner;

public class VowelConsonant {

    public static void main(String [] args){//main metod declaration
        char ch;//local variable
        Scanner scan=new Scanner(System.in);
//This statements takes input from theuser
        System.out.print("Enter an Alphabet: ");
//get input and it is stored ch variable
        ch=scan.next().charAt(0); // appling if else conditions
        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
            System.out.print(ch+" is vowel");
        }
        else{
            System.out.print(ch+" is  consonant");
        }
    }//end of mainmethod
}



