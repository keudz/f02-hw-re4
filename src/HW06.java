import java.util.Scanner;

public class HW06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if ( a > 0 && b > 0 && c > 0 ){
            if ( a + b > c && a + c > b && b + c > a  ) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }else{
            System.out.println("canh tam giac k the am");
        }

    }
}
