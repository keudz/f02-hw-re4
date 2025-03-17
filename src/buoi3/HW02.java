package buoi3;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bien = sc.nextInt();
        if ( bien % 2 == 0) {
            System.out.println("la so chan");
        }
        else{
            System.out.println("le so le");
        }
        if( bien > 0){
            System.out.println("bien la so duong");
        }
        else if ( bien == 0){
            System.out.println("bien la so 0");
        }
        else{
            System.out.println("bien la so am");
        }
    }



}