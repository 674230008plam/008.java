// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 

package W11;

public class W11_01_exLoopFor {
    public static void main(String[] args) {
        
        // System.out.println("รอบที่ 1");
        // System.out.println("รอบที่ 2");
        // System.out.println("รอบที่ 3");
        // System.out.println("รอบที่ 4");
        // System.out.println("รอบที่ 5");

        for(int i=1; i<=5; i++ ){
            System.out.println("รอบที่ "+i);
        }
// โครงสร้างคำสั่งลูป for แบ่งออกเป็น 3 ส่วน
// 1. ส่วนตัวแปรเริ่มต้น
// 2. เงื่อนไข
// 3. การเพิ่มค่า / การลดค่า

// TODO


// ======================================================================

//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World

// TODO

       for(int i=1; i<=5; i++ ){
            System.out.println("รอบที่ "+i+ " Hello world");
       }

// ======================================================================

//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10

// TODO
       for(int j=1; j<=10;j++){
            System.out.print(j+" ");      
       }

// ======================================================================


//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55

// TODO 
       System.out.println();
        int sum = 0;
            for(int j=1; j<=10;j++){
         System.out.print(j+" ");  
         sum = sum+j;     //sum +=j;
        }
        System.out.println("= "+sum);
// ======================================================================

//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55

// TODO
    System.out.println();
     sum = 0;
        for(int j=1; j<=10;j++){
         System.out.print(j+" ");  
         if(j<10){
                System.out.println("+");
            }
            sum = sum+j;     //sum +=j;
        }
        System.out.println("= "+sum);

// ======================================================================


//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 10 9 8 7 6 5 4 3 2 1

// TODO
int num = 10;
        for(int j=1; j<=10;j++){
         System.out.print(num+" ");  
         num--;     
        }


// ======================================================================

//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 3 5 7 9 11 13 15 17 19

// TODO
        System.out.println("\n");
        sum = 1;
        for (int j =1; j<=10; j++){
            System.out.print(sum + " ");
            sum += 2;
        }


// ======================================================================

//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 2 4 6 8 10 12 14 16 18 20

// TODO
System.out.println("\n");
sum = 2;
for (int j =1; j<=10; j++){
    System.out.print(sum + " ");
    sum += 2;
}

// ======================================================================

//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 4 9 16 25 36 49 64 81 100

// TODO
 System.out.println(" \n");
 for (int j =1; j <=10; j++){
        sum = j*j;
        System.out.print(sum + " ");
        
 }

// ======================================================================

//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่

// TODO
        for(int i=1; i<=5; i++){
            if(i%2==0){
            System.out.println("รอบที่ "+ i + " เลขคี่");
            }else{
            System.out.println("รอบที่ "+ i + " เลขคู่");
            }
        }

// ======================================================================
    }
}