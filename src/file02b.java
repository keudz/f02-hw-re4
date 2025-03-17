import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.Scanner;

public class file02b {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner myobj = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\input02.txt"));
        float c  = myobj.nextFloat();
        float f  = ((c * 9) / 5) + 32;
        myobj.close();
        PrintWriter cc = new PrintWriter("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\output02.txt");
        cc.printf("%.2f C = %.2f F", c, f);
        cc.close();

    }
}