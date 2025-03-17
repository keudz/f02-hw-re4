package buoi8;

public class Tinh20GiaiThuaMod2752 {
    public static void main(String[] args) {
        long giaithua = 1;
        for( int i = 1; i <= 20; i++){
            giaithua *= i;
        }
        System.out.println(giaithua %  2752 );
    }
}
