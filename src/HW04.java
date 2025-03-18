import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\file94");;
        double [][][] arr = new double[3][3][3];
        System.out.println("nhap cac phan tu mang: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    arr[i][j][k] = sc.nextDouble();
                    pw.println(arr[i][j][k]);
                }
            }
        }pw.close();
    }
}