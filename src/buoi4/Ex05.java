package buoi4;

public class Ex05 {
     public static void main(String[] args) {
         int n = 1;
         while( n * n * n < 12000 ){
           n++;
         }
         System.out.println("so lon nhat la: "+ (n - 1) );
     }
}//xong
