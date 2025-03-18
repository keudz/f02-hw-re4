public class Ex02 {
    public static void main(String[] args) {
        // gọi i là số năm
        for( int i = 1; i <= 10; i++){
            double hocphi = 10000 + 10000 * 5.0/100 * i;
            System.out.println("hoc phi nam " + i + " la " + hocphi);
        }double tonghocphi = 0;
        for( int i = 11; i <= 15; i++){
            tonghocphi = 10000 + 10000 * 5.0/100 * i + tonghocphi;
        }System.out.println("tong hoc phi cua 4 nam bat dau tu nam 11 la:" + tonghocphi);
    }
}//xong
