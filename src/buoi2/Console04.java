package buoi2;

import java.util.Scanner;

public class Console04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nguyen:");
        int ngay = sc.nextInt();
        int thang = sc.nextInt();
        int nam = sc.nextInt();
        System.out.printf("%d / %d / %d",ngay,thang,nam);
    }
}