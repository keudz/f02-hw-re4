package buoi2;

import java.util.Scanner;

public class Console01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap gia tri:");
        float myint = sc.nextFloat();
        System.out.printf("%.2f",myint * 2.54);
        System.out.print("cm");


    }
}

