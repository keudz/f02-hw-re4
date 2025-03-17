package buoi4;

import java.util.Scanner;

public class Ex14 {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        int number;
        int max = 0;
        char maxst = st.charAt(0);
        for (int i = 0; i < st.length(); i++) {

            number = 0;
            for( int j = 0; j < st.length(); j++ ){

                if( st.charAt(j) == st.charAt(i))
                    number++;
            }if(number > max){
                max = number;
                maxst = st.charAt(i);
            }


        }System.out.println("phan tu suat hien nhieu nhat la: " + maxst);
        System.out.print("voi tan suat la : "+ max + " lan");



    }
}//xong


