package buoi4;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tien = sc.nextInt();
        int to500 = 0;
        int to200 = 0;
        int to100 = 0;
        int to20 = 0;
        int to10 = 0;
        int to5 = 0;
        int to2 = 0;
        while( tien >= 500 ){
            to500++;
            tien -= 500;
        }
        while(tien >= 200 ){
            to200++;
            tien -= 200;
        }
        while( tien >= 100 ){
            to100++;
            tien -= 100;
        }
        while( tien >= 20 ){
            to20++;
            tien -= 20;
        }
        while( tien >= 10 ){
            to10++;
            tien -= 10;
        }
        while( tien >= 5 ){
            to5++;
            tien -= 5;
        }
        while( tien  >= 2 ){
            to2++;
            tien -= 2;
        }System.out.println( "co :" + to500 + "to 500");
        System.out.println( "co :" + to200 + "to 200");
        System.out.println( "co :" + to100 + "to 100");
        System.out.println( "co :" + to20 + "to 20");
        System.out.println( "co :" + to10 + "to 10");
        System.out.println( "co :" + to5 + "to 5");
        System.out.println( "co :" + to2 + "to 2");
        System.out.println("tong so to la :"+ (to500 + to200 + to100 + to20 + to10 + to5 + to2) + "to");
    }
}//xong
