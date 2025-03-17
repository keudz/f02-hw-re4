package buoi8;

public class tim_so_ngto_thu_500 {
    public static void main(String[] args) {
        int number;
        int count = 0;
                for(int i = 2 ; i < 9999999 ; i++){
                    number = 0;
                    for(int j = 2 ; j <= Math.sqrt(i)  ; j++){
                        if( i % j == 0){
                            number++;
                            break;
                        }




                    }if(number == 0){
                        count++;
                    }
                     if(number == 0 && count == 500){
                        System.out.println(i);
                        break;
                    }


                }

    }
}
