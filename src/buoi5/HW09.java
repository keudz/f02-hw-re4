package buoi5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW09 {
    public static void main(String[] args) throws FileNotFoundException {
        // nhập dự liệu từ console và in ra console
        Scanner bun = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\input99"));
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.print(arr[i] + " ");
        }sc.close();
        // lấy dữ liệu từ file  và in ra file
        int[] arr1 = new int[10];
        int count = 0;
        while (bun.hasNext() && count < arr1.length) {
            arr1[count] = bun.nextInt();
            count++;
        }bun.close();

        PrintWriter pw = new PrintWriter("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\output99");
        for (int i = 0; i < arr1.length; i++) {
            pw.println(arr1[i]);
        }
        pw.close();
        System.out.println("sum =: "+ sum(arr));
        System.out.println("max =: "+ max(arr));
        System.out.println("min =: "+ min(arr));
        System.out.println("imin =: "+ imin(arr));
        System.out.println("max =: "+ imax(arr));
        System.out.println("fist1: " + first1(8,arr));
        System.out.println("last: " + last(8,arr));
        hoandoi(arr,0,9);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }



    // tính tổng của các ptu trong mảng
    public static double sum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }
    // tìm max cua mảng 1 chiều
    public static double max(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }


    // tìm min của 1 chiều
    public static double min(double[] arr) {

        double min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }
    //tìm index nhỏ nhất của mảng 1 chiều
    public static double imin(double[] arr) {
        double min = arr[0];
        int imin = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min){
                min = arr[i];
                imin = i;
            }
        return imin;
    }
    //tìm index lớn nhất của mảng 1 chiều
    public static double imax(double[] arr) {
        double max = arr[0];
        int imax = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max){
                max = arr[i];
                imax = i;
            }
        return imax;
    }
    //tìm vị trí của số ầu tiên bằng ptu nào đó trong mảng
    public static double first1(double n, double[] arr) {

        for (int i = 0; i < arr.length; i++)
            if (n == arr[i])
                return i;

        return -1;


    }
    // tìm vị trí của số cuối cùng bằng ptu nào đó trong mảng
    public static double last(double n, double[] arr) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n)
                number++;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == n) {
                count++;
                if (count == number)
                    return i;
            }

        }return -1;

    }
    //hoán đổi vị trí của 2 phần tủ bất kỳ
    public static void hoandoi(double[] arr,int a,int b) {
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;

    }

}

