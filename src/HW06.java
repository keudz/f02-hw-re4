import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double []arr = new double[9];
        double []brr = new double[9];
        int n = 9;
        int i;
        double number = 0;
        System.out.print("nhap cac phan tu mang:");
        for( i = 0; i < n; i++ ){
            arr[i] = sc.nextDouble();
        }for(i = 0; i < n; i++){
            brr[i] =  n - i;
            if(Math.abs(arr[i] - brr[i]) < 1 ){
                number++;
            }
        }if(Math.abs(number -  (n / 2.0)) < 1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}

