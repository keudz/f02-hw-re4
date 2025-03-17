package buoi4;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("nhap vao so hoc sinh lon hon 2:");
    int n = sc.nextInt();// n là số học sinh
        sc.nextLine();
        int number = 0;
        double diemmax1 = 0;
        double diemmax2 = 0;
        String tenmax1 = "";
        String tenmax2 = "";
        for( int i = 0; i < n; i++ ) {
            System.out.println("nhap ten cua hs " + i +" :");
            String name = sc.nextLine();
            System.out.println("diem cua " + name + " la:");
            double diem = sc.nextDouble();
            sc.nextLine();
            if( diem > diemmax1 ) {
                diemmax2 = diemmax1;
                diemmax1 = diem;
                tenmax2 = tenmax1;
                tenmax1 = name;
            }
            else if( diem > diemmax2 && diem < diemmax1 ) {
                diemmax2 = diem;
                tenmax2 = name;
            }
            else if( diem == diemmax1)
             number++;
        }if(number != (n - 1)){
            System.out.println("hoc sinh co diem cao nhat la: "+tenmax1);
            System.out.println(diemmax1);
            System.out.println("hoc sinh co diem cao nhi la: "+tenmax2);
            System.out.println(diemmax2);
            }

        else
            System.out.println("tat ca hoc sinh co diem bang nhau");


    }

}//xong

