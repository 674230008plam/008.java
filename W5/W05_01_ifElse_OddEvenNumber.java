import java.util.Scanner;
public class W05_01_ifElse_OddEvenNumber{

    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = kb.nextInt();
        int result = number% 2;
        if(result==0){
            System.out.println(number + "is an even number.");
        }else{
            System.out.println(number + "is an Odd number");
        }

    }
}