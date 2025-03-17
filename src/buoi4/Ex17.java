package buoi4;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int somu;
        System.out.println(input + " = "  );
        int thuasont = 2;// gọi i là thừa số nguyeen tố.

        while( input > 1){
            somu = 0;
        while(input % thuasont == 0){
            somu++;
            input /= thuasont;
        }if(somu > 0){
            System.out.println(thuasont);
            if( somu > 1){
               System.out.println("^" + somu);
            }if(input > 1){
                System.out.println("*");
                }

        }thuasont++;
        }
    }
 }












