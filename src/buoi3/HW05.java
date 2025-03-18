package buoi3;

import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canhdai = sc.nextDouble();
        double canhnga = sc.nextDouble();
        System.out.println("chu vi hcn la:" + (canhdai + canhnga) * 2);
        System.out.println("dien tich la:" + (canhdai * canhnga));
    }
}