package buoi4;

import javax.swing.*;
import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 so nguyen:");
        int n = sc.nextInt();//gọi n là input;
        int m = n;
        int min = 10;
        int sodau = 0;
        int du;
        int max = 0;

        while( n != 0){
             du = n % 10;
            n /= 10;
            if(du < min ){
                min = du;

            }
//            else
//                 max = du;

        }while(m != 0 ){
             sodau = m % 10;
            m /= 10;
        }if( sodau == min || sodau == max){
            System.out.println("yes");

        }else
            System.out.println("no");

    }
}//xong
