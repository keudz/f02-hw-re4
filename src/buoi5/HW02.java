package buoi5;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cac phan tu mang:");
        int []arr = new int[10];
        int number = 0;
        int i;

        for ( i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("nhap 1 so nguyen n");
        int n = sc.nextInt();
        for( i = 0;i < 10;i++){
            if (arr[i] == n){
                number++;
                System.out.println("index cua n trong mang la:" + i);
            }


        }if( number == 0)
            System.out.println(-1);


    }
}

