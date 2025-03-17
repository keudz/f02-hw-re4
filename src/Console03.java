import java.util.Scanner;

public class Console03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phut:");
        int p = sc.nextInt();
        int nam = p / 525600;
        p = p % 525600;
        System.out.printf("%d",nam);
        System.out.println(" nam");
        int ngay = p / 1440;
        p = p % 1440;
        System.out.printf("%d",ngay);
        System.out.println(" ngay");
        int gio = p / 60;
        p = p % 60;
        System.out.printf("%d",gio);
        System.out.println(" gio");
        int phut = p % 60;
        System.out.printf("%d",phut );
        System.out.print(" phut");

    }
}