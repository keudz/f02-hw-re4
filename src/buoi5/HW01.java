import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cac phan tu mang");
        double []arr = new double[10];
        double sum  = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }System.out.println("sum = " + sum );

    }

}
