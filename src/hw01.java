import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class hw01 {

        public static void main(String[] args) throws IOException {
            Scanner file = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\out\\File01"));
            double inch = file.nextDouble();
            double cm = inch * 2.54;
            file.close();
            PrintWriter writer = new PrintWriter("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\out\\File02");
            writer.println(inch + "inch = " + cm + "cm ");
            writer.close();

        }
}
