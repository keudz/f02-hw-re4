import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][]arr = new double[3][3];
        double max = -Double.MAX_VALUE;
        System.out.println("nhap  cac phan tu mang:");
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextDouble();
                if( arr[i][j] > max)
                    max = arr[i][j];
            }

        System.out.println("gia tri lon nhat trong mang la: " + max);

    }
}

