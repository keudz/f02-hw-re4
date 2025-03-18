package buoi5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HW08 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\file01111.txt"));
        int input;
        int du ;
        int number;
        int count;
        int dem;
        int i = 0;
        int[] arr = new int[100];

        while (sc.hasNext()) {
            arr[i] = sc.nextInt();
            i++;
        }

        for (int j = 0; j < i; j++) {
            count = 0;
            dem = 0;
            number = 0;
            for (int k = 0; k < i; k++) {
                if (arr[j] == arr[k]) {
                    count++;
                }
            }

            input = arr[j];
            while (input != 0) {
                du = input % 10;
                input /= 10;
                dem++;
                if (du == 2 || du == 3 || du == 5 || du == 7)
                    number++;



            }if(number == dem)
                System.out.println(arr[j] + " với số lần xuất hiện là " + count);


        }
    }
}