import java.util.Scanner;//นำเข้าคลาส Scanner จาก backage java.util
public class W04_AreaCircle{

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);//สร้างอ็อบเจ็กต์ของคลาส Scanner
        System.out.print("ป้อนค่ารัศมีของวงกลม"); //แสดงข้อความที่ให้ใช้ป้อนค่ารัศมี
        double radius = sc.nextDouble();//รับค่ารัศมี

        // double radius; //ประกาศตัวแปรเก็บค่ารัศมี
        // radius = 34; //กำหนดรัศมีมีค่าเป็น 10
        double area;// ประกาศตัวแปรเก็บค่าพื้นที่
        final double PI = 3.1459; // ประกาศคงที่ PI

        area = PI*radius*radius; //คำนวณพื้นที่ของวงกลม
    System.out.println("พื้นที่ของวงกลมที่มีรัศมีเท่ากัน"+radius+"คือ"+area);

    }
}