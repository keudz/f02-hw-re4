package buoi7;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu mang:");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        for( int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                   double temp =  arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
    }System.out.println("min1 = " + arr[0] + " min2 = " + arr[1]);
}
}