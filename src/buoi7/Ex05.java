package buoi7;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phtu mang");
        int n = sc.nextInt();
        System.out.println("nhap cac phtu mang");
        int []arr = new int[n];
        for( int i = 0; i < n; i++){
          arr[i] = sc.nextInt();
        }
        tamgiac(arr);
    }
    public static void tamgiac(int arr[]){
        System.out.println(Arrays.toString(arr));
        int []sum = new int[arr.length - 1];
        if(arr.length == 1){
            return;


        }
        else
            for(int i = 0; i < arr.length - 1; i++)
                sum[i] = arr[i+1] + arr[i];

        tamgiac(sum);


    }
}
