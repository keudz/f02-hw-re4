package buoi6;

import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số đũa cần bảo vệ");
        int n = sc.nextInt();
        int[] sizedua = new int[n];
        int[] sizehop = new int[n];
        int number = 0;
        System.out.print("nhap so size dua:");
        for (int i = 0; i < n; i++) {
            sizedua[i] = sc.nextInt();
        }
        System.out.print("nhap so size hop:");
        for (int i = 0; i < n; i++) {
            sizehop[i] = sc.nextInt();
        }
       for (int i = 0; i < n; i++) {

           if (sizedua[i] <  sizehop[i])
               number++;
       }

           if (number == n)
               System.out.println("co the giai cuu");

           else
               System.out.println("khong the giai cuu ");
       }

    }

