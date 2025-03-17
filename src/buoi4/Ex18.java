package buoi4;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pheptoan = sc.nextLine();
        int a = pheptoan.charAt(0) - '0';
        int b = pheptoan.charAt(2) - '0';
        int c = pheptoan.charAt(4) - '0';
        if (a + b == c)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
