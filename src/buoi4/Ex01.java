package buoi4;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            int number = 0; //biến đếm của số dương
        int count = 0;// biến đếm của số âm
        double sum = 0;// tong cac so
        double input;
        while( true){
             input = sc.nextDouble();
            if( input == 0)
                break;
            if(input > 0)
                number++;
            if(input < 0)
                count++;
            sum += input;
        }
        System.out.println("tong la: " + sum);
        System.out.println("co: " + number + " so duong");
        System.out.println("co: " + count + " so am");
        if((number + count) > 0 )
        System.out.println("trung binh cong: " + sum / (number + count));
        else System.out.println("khong co trung binh cong");
        System.out.println("change feature/zoom");

    }
}//xong
