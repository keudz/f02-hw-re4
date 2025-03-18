import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW05 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\fileinput95"));
        PrintWriter pw = new PrintWriter("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\fileoutput95");
        int []arr = new int[100];
        int i = 0;
        int sum = 0;
        while( sc.hasNext()){
            arr[i] = sc.nextInt();
            sum += arr[i];
            i++;
        }

        pw.println("sum = " + sum);
        pw.close();


    }
}



