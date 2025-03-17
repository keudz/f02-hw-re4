package buoi7;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n:");
        int n;
        while(true){
            n = sc.nextInt();
            if( n > 0 && n < 1000)
                break;
            else{
                System.out.println("nhap lai n:");
                continue;
            }

    }
        System.out.println("tong tu 1 den n la:" + sum(n));

   }
   public static int sum ( int n){
       if( n == 1)
       return 1;
       else
           return sum(n-1) + n;

   }
}
