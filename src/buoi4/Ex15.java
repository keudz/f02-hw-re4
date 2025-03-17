package buoi4;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap 2 so duong a va b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int s = a * b;
        while( a != b){
            if(a < b)
                b -= a;
            else
                a -= b;
        }System.out.println("uoc chung lon nhat la: "+ a );
        System.out.println("boi chung nho nhat la: "+ s / a);

    }
}//xong
