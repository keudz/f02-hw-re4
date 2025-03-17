package buoi8;

public class tim_so_nho_nhat_co_tong_cac_so_bang30 {
        public static void main(String[] args) {
            for(int i = 1000; i < 9999; i++){
                int n = i;
                int sum = 0;
                while(n != 0){
                    int du = n % 10;
                    n /= 10;
                    sum += du;

                }if(sum == 30){
                    System.out.println(i);
                    break;
                }

            }
        }
}
