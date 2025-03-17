package buoi4;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so nguyen duong:");
        int n = sc.nextInt();//n là input
        int number = 0;
        for( int i = 1; i <= n; i++){
            if(n % i == 0 && i % 2 ==0)
                number++;
        }System.out.println("so uoc cua n chia het cho 2 la:" + number);


    }
}//xong
