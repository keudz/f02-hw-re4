package buoi8;

public class so_uoc_chia_het_cho_3 {
    public static void main(String[] args) {
        int  input = 972;
        int number = 0;
            for( int i = 1; i <= input; i++) {
                if( input % i == 0 && i % 3 == 0){
                    number++;
                }
            }
            System.out.println("số ước thoả mãn là: " + number);
    }
}
