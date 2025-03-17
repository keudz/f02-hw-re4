package buoi8;

public class Tim_so_fibonacci_thu50 {
    public static void main(String[] args) {
        long a = 0, b = 1;
        long c = 0;
        for( int i = 1; i < 50; i++){
            c = a + b;
            a = b;
            b = c;


    }
        System.out.println(c);

    }
}
