package buoi4;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 1 so nguyen lon hon 2 so va be hon 9 so:");
        int input0 = sc.nextInt();
        int input1 = input0;

        int sodau = 0;
        while (input0 != 0) {
            sodau = input0 % 10;
            input0 /= 10;
        } int socuoi = input1 % 10;
        if (socuoi == sodau)
            System.out.println("so dau bang so cuoi");
        else
                System.out.println("so dau khong bang so cuo");
    }
    }//xong