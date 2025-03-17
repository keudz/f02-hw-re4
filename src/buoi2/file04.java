package buoi2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class file04 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\input04.txt"));
        int ngay = sc.nextInt();
        int thang = sc.nextInt();
        int nam = sc.nextInt();
        sc.close();
        PrintWriter writer = new PrintWriter("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\output04.txt");
        writer.printf("%d / %d / %d",ngay,thang,nam);
        writer.close();
    }
}
