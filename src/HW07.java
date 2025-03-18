import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW07 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang");
        int n = sc.nextInt();
        int number;

        double[] arr = new double[n];
        System.out.println("nhap cac phan tu mang:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();

        }
        for (int i = 0; i < n; i++) {
            number = 0;
            for(int j = 0; j < n; j++){
                if( arr[i] == arr[j])
                    number++;

            }if ( number >= 2 ){
                System.out.println(arr[i]);
                break;
            }

        }


    }
}