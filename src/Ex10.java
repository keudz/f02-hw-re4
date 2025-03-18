import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tu nhien n:");
        int n = sc.nextInt();
        int a = 1;
        int b = 0;
        int c = 0;
        for(int i = 0; i < n; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println("so fibonacci cua "+ n + "la: "+ c);
    }
}
