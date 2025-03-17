package buoi4;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {

        System.out.println("nhap so phan tu:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("nhap cac phan tu:");

        int number = 1;
        int max = -999999;
        for (int i = 0; i < n; i++){
              number = 0;
            int bien = sc.nextInt();
            if ( bien > max ) {
                max = bien;
                continue;

            }
               if( bien == max )
                   number++;

        }System.out.println("tan so cua phan tu lon nhat la: "+ (number + 1) + " lan ");
    }
}//xong
