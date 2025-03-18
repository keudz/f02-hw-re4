package buoi6;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng thuộc [0,20]:");
        for (int i = 0; i < n; i++) {
            while (true) {
                arr[i] = sc.nextInt();
                if (arr[i] >= 0 && arr[i] <= 20) {
                    break;
                } else {
                    System.out.println("Bạn đã nhập quá giới hạn của phần tử mảng!!!");
                    System.out.println("Nhập lại!!");
                }
            }
        }

        // Sắp xếp mảng theo tần suất xuất hiện
        swap(arr, n);

        System.out.println("Mảng sau khi sắp xếp:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int ptudau(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }

    public static int[] swap(int[] arr, int n) {
        int[] tanso = new int[21];
        for (int i = 0; i < n; i++) {
            tanso[arr[i]]++;
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (tanso[arr[i]] < tanso[arr[j]] ||
                        (tanso[arr[i]] == tanso[arr[j]] && ptudau(arr, arr[i]) > ptudau(arr, arr[j]))) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
