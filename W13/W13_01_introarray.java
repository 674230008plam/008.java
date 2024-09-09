package W13;

public class W13_01_introarray {
    public static void main(String[] args) {
        // ประกาศตัวแปรชนิด array แบบที่ 1 - ไม่รู้จำนวนล่วงหน้า
        String[] colors = {"Purple", "Cyan", "Blue", "Green", "Yellow", "Orange", "Red"};
        int [] banks = {20,50,100,500,1000};
        char [] alphabets = {'A','B','C','D','E'}; 
        // แสดงผลลัพธ์โดยใช้ index ของ Array
        System.out.println("The first color is" + colors[0]);
        System.out.println("The Third alphabet is " + alphabets[2]);

        //แสดงผลลัพธ์โดยใช้ loop
        System.out.println("colors in the array are: ");
        for (int i = 0; i < 7; i++){
            System.out.print(colors [i] + " ");
        }
        System.out.println("");
        for (int i = 6; i >= 0; i--){
        System.out.print(colors [i] + " ");
        }

        System.out.println("Banks in the array:");
         for (int i = 0; i <  banks.length; i++){
            System.out.print(banks[i] + " ");
         }
        }
    }
