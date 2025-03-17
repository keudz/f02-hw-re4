package buoi2;

import java.util.Scanner;

public class Console05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ten = sc. nextLine();
        int tuoi = sc.nextInt();
        float chieucao = sc.nextFloat();

        System.out.printf(" ho va ten : %s\n", ten);

        System.out.printf("tuoi:%d\n",tuoi);

        System.out.printf(" chieu cao : %.2f\n",chieucao);


    }
}