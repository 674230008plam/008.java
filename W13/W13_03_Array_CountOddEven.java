package W13;

public class W13_03_Array_CountOddEven {
    public static void main(String[] args) {
        //ให้นับเลขคู่เลขคี่ใน Array ด้านล่าง
    int [] numbers = { 1, 5, 6, 9, 15, 12, 7, 18, 17, 11, 21, 23, 25, 27, 22, 2, 36, 14,};

        int countOdd = 0;
        int countEven = 0;

        System.out.println("number in the array are: ");
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers [i] + " ");
            if(numbers [i] % 2 == 0){
                //ใส่เงื่อนไข คู่
                countEven++;
            }else{
                //ใส่เงื่อน คี่่
                countOdd++;
            }
        }
         System.out.println("\nAmount of all numbers : " + numbers.length);
         System.out.println("Amount of Odd numbers : " + countOdd);
         System.out.println("Amount of Even numbers : " + countEven);
    }
}
