package buoi4;

public class Ex06 {
    public static void main(String[] args) {
        int number ;
        for( int i = 2; i <= 1000; i++){
            number = 0;
            for( int j = 2; j <= i; j++){
                if( i % j == 0){
                    number++;
                }
                }if( number == 1)
                    System.out.println(i);

       }
    }
}//xong
