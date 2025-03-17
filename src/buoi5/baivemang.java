//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class baivemang {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc = new Scanner(System.in);
//        while( sc.hasNext() ){
//            Scanner sc1 = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\file01111.txt"));
//
//            int i ;
//            int j ;
//            int du = 0;
//            int number;
//            int count = 0;
//            int a = sc1.nextInt();
//            int []arr = new int[]{};
//
//                 i = 0;
//                while( sc1.hasNext() ){
//
//                    for( j = 0 ; j < arr.length - 1 ; j++ ) {
//                        if (arr[j] == arr[j + 1])
//                          count++;
//                    }
//
//                    number = 0;
//                if(arr[i] != 0 ){
//                    du = arr[i] % 10;
//                    arr[i] /= 10;
//                    if( du == 2 || du == 3 || du == 5 || du == 7){
//                        System.out.println(arr[i] + "voi so lan xuat hien la" + count);
//                }
//
//
//
//
//                }i++;
//            }
//        }
//    }
//}
