package buoi4;

public class Ex04 {
    public static void main(String[] args) {
        for( int i = 100; i <= 200; i++){
            if( i % 5 == 0 && i % 6 == 0)
                continue;
            if( i % 5 == 0 || i % 6 == 0){
                System.out.println(i);
            }
        }
    }
}//xong
