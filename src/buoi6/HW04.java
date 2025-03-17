package buoi6;

import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phan tu mang:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("nhap cac phan tu mang la so nguyen k am:");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        swap(arr);
        System.out.print("nhap 1 so k:");
        int k = sc.nextInt();
        int[] arr1 = new int[k];
        for(int i = 0 ; i < k  ; i++){
            arr1[i] = arr[i];
            arr[i] = 0;
        }
        int sum1 = 0;//tong cac phan tu trong mang  N - K;
        for( int i = 0 ; i < n ; i++){
            sum1 += arr[i];
        }int sum2 = 0;// tong cac phan tu trong mang K;
        for( int i = 0 ; i < k  ; i++){
            sum2 += arr1[i];
        }
        if(sum1 > sum2)
            System.out.print("hieu cua sum 2 array: " + sum1 + " - " + sum2 + " = " + (sum1 - sum2));
        else
            System.out.print("hieu cua sum 1 array: " + sum2 + " - " + sum1 + " = " + (sum2 - sum1));
    }





    public static void swap(int arr[]){
        for(int i = 0 ; i < arr.length - 2  ; i++)
            for(int j = i + 1 ; j < arr.length - 1 ; j++)
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }



