package buoi4;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tu nhien n:");
        long  n = sc.nextLong();
        long  a = 1;
        long  b = 0;
        long  c = 0;
        for(int i = 0; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("so fibonacci cua "+ n + "la: "+ c);
    }
}
