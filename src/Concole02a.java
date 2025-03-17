import java.util.Scanner;

public class Concole02a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap do F:");
        float doF = sc.nextFloat();
        System.out.printf("%.2f",((doF -32 ) * 5)/9);
        System.out.print("C");
    }
}