package buoi6;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so phtu mang:");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            for( int j = i + 1; j < n; j++){
                if( arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }int left = 0 , right = n - 1;
        while( right >= left ){
            if(arr[right] > arr[left]){
                System.out.print(arr[right] + " " + arr[left] + " ");
            }else
                System.out.print(arr[left]);
            right--;
            left++;
        }

            }

    }


