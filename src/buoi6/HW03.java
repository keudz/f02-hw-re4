package buoi6;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu mang:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int number = 0;
        for (int i = min(arr); i <= max(arr); i++) {
              number++;
        }
        System.out.println(number - n);}






    public static int min(int []arr){
        int min = arr[0];
            for (int j = 1; j < arr.length; j++){
                if( arr[j] < min)
                    min = arr[j];
            }
            return min;
        }
    public static int max(int []arr){
        int max = arr[0];
        for(int j = 1; j < arr.length; j++){
            if ( arr[j] > max)
                max = arr[j];
        }
        return max;
    }
    }

