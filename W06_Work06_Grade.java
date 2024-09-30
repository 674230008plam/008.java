import java.util.Scanner;
public class W06_Work06_Grade {
    public static void main (String [] args) {
        System.out.println(" My Name: Ratchapong Tantiprasoplap /// รหัส:674230008 ");
        System.out.println(" Grade ");
        Scanner kb = new Scanner(System.in);

        int Score = kb.nextInt();


        if(Score >= 101){
            System.out.println("Please enter a value between 0 and 100");

        }else if(Score <= 0) {
            System.out.println("Please enter a value between 0 and 100");

        }else if(Score >= 80){
            System.out.println("Grade A");

        }else if(Score >= 70){
            System.out.println("Grade B");

        }else if(Score >= 60){
            System.out.println("Grade C");

        }else if(Score >= 50){
            System.out.println("Grade D");

        }else{
            System.out.println("Grade E");
        }

     }


 }