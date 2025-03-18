import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        double thuong = (double)a/b;
        System.out.println("tong = " + tong);
        System.out.println("hieu = " + hieu);
        System.out.println("tich = " + tich);
        if( b == 0){
            System.out.println("mau bang 0 k the chia");
        }else if ( b != 0){
            System.out.println("thuong =" + thuong);
        }

    }
}