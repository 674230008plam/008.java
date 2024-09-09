package W13;

import java.util.Scanner;
public class W13_02_introarray {
    public static void main(String[] args) {
    // ประกาศตัวแปรชนิด Array แบบที่ 2 - ไม่รู้จำนวนข้อมูลล่วงหน้า
        String [] brandCars = new String[3];
        Scanner kd = new Scanner(System.in);

        // กำหนดค่าให้ Array
        brandCars[0] = "Toyota";
        brandCars[1] = "Honda";
        brandCars[2] = "Nissan";

        System.out.println("Old Brand of cars in the array are:");
        for (int i = 0; i < brandCars.length; i++) {
            System.out.print(brandCars [i] + " / ");
        }
        System.out.println("\n\nPlease enter the brand of the 3rd car:");
        for (int i = 0; i < brandCars.length; i++){
            System.out.println("Enter brand " + (i+1) + ": ");
            brandCars[i] = kd.next();

        }

         brandCars[2] = "MG";
        System.out.println("\nNew Brand of cars in the array ares: ");
        for (String car : brandCars) {
            System.out.print(car + " / ");
        }
    }
    
}
