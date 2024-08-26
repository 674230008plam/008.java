public class W03_Ratchapong{
    public static void main(String[] args) {
        //สร้างตัวแปลของค่าแต่ละอย่าง
        short price = 350; 
        byte quantity = 10;
        
        int totalprice = price * quantity;

        int discount = totalprice * 5 /100;

        int netprice = totalprice - discount;
        System.out.println("total price = "+( totalprice + "Baht"));
        System.out.println("discount = "+( discount + "Baht"));
        System.out.println("netprice = "+( netprice +  "Baht"));
    }
}