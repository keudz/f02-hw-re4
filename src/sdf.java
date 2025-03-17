import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class File03
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\input03.txt"));
        int phut = file.nextInt();
        int nam = phut / 525600;
        phut %= 525600;
        int ngay = phut / 1440;
        phut %= 1440;
        int gio = phut / 60;
        phut %= 60;
        int phuts = (int)phut % 60;
        file.close();
        PrintWriter writer = new PrintWriter("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\output03.txt");
        writer.println(nam + " nam  " + ngay + " ngay " + gio + " gio " + phuts + " phuts ");
        writer.close();

    }
}
