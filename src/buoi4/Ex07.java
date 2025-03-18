import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int giathua = 1;
        for( int i = 1; i <= n; i++){
            giathua = i * giathua;
        }
        System.out.println("giai thua cua " + n + " = " + giathua);
    }
}//xong
