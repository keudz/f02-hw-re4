package buoi4;//import java.util.Scanner;
//
//public class Ex09 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("nhap so phan tu");
//        int n = sc.nextInt();
//        int max1 = -999999;
//        int max2 = -999999;
//
//        for (int i = 0; i < n; i++) {
//            int ma =  sc.nextInt();//ma là các phần từ âm của dãy
//            if( ma >= 0){
//                System.out.println("nhap so am");
//                i--;
//                continue;
//            }if(ma > max1){
//                max2 = max1;
//                max1 = ma;
//
//            }else if( ma > max2 && ma < max1)
//                max2 = ma;
//
//
//        }if( max2 == -999999)
//        System.out.println("k co so lon thu 2");
//         else
//             System.out.println("so lon thu 2 la: " + max2);
//
//    }
//
//
//}//xong
