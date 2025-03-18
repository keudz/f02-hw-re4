import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = 0; //biến đếm của số dương
        int count = 0;// biến đếm của số âm
        double sum = 0;// tong cac so
        while( true){
            double input = sc.nextDouble();
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
        System.out.println("trung binh cong: " + sum / (number + count));
    }
}//xong