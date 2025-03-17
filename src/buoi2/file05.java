package buoi2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class file05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\input05.txt"));
        String ten = sc.nextLine();
        int age = sc.nextInt();
        float cao = sc.nextFloat();
        sc.close();
        PrintWriter writer = new PrintWriter("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\output05.txt");
        writer.println("ho va ten :" + ten);
        writer.println("age :" + age);
        writer.println("Cao :" + cao);
        writer.close();

    }
}
