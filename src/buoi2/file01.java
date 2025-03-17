package buoi2;

import java.io.*;

import java.util.*;

public class file01 {
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
