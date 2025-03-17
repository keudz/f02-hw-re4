package buoi4;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        System.out.println("nhap 1 so bat ky:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 1  ; i < n; i++ ) {
            for( int j = 1; j <= Math.sqrt( i); j++){
                if( j * j == i){
                    System.out.println(i);
                }
            }
        }
    }
}// xong
