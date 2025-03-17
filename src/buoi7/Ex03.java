package buoi7;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap X:");
        int x;
        while (true){
             x = sc.nextInt();
            if (x > 0){
                break;
            }
            else{
                System.out.println("nhap so X lon hon 0!!!");
                continue;
            }
        }
        int n;
        System.out.println("nhap n:");
        while ( true){
             n = sc.nextInt();
            if (n < 20){
                break;
            }
            else{
                System.out.println("nhap so nguyen duong be hon  20!!!");
                continue;
            }
        }
        System.out.println("so mu X^n = " + somu(x,n));


    }
    public static int somu(int x,int mu){
        if(mu == 1)
         return x;
         else
             return x * somu(x,mu -1);
    }
}
