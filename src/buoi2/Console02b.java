package buoi2;

import java.util.Scanner;

public class Console02b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap do C:");
        float doc = sc.nextFloat();
        System.out.printf("%.2f",(9 * doc) / 5 + 32);


    }
}
