package buoi2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class file02a {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\intput.txt"));
        double f = file.nextDouble();
        double c = ((f - 32) * 5 )/9;
        file .close();
        PrintWriter dm = new PrintWriter("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\output.txt");
        dm.printf("%.2fF = %.2fC",f,c);
        dm.close();
    }
}