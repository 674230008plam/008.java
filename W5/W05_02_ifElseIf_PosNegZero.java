import java.util.Scanner;
public class W05_02_ifElseIf_PosNegZero {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = kb.nextInt();
        //int result = number > 0; 
        if(number > 0){
            System.out.println("Positive");
        }else if(number < 0 ){
          System.out.println("Nagative");
        }else if(number==0){
            System.out.println("Zero"); 
            //else = System.out.println ("Zero");
        }else{
            System.out.println("Input:");
        }
    }
}