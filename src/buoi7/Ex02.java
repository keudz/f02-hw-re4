package buoi7;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter so phan tu mang:");
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        for( int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("nhap X can tim:");
        double x = sc.nextDouble();
        System.out.println(find(arr , x, arr[0], arr[arr.length - 1]));


        }
    public static int find(double arr[], double key, double low, double high){
        while(high >= low){
            int mid = (int)(low + high)/2;
            if(key > mid)
                low = mid + 1;
            else if(key < mid)
                high = mid - 1;
            else
                return 1;

        }
        return -1;
    }


}

