package buoi8;

import javax.swing.*;

public class kiem_tra_xau_doi_xung {
    public static void main(String[] args) {
        String a = "aecoceoaaeceoaaeoceooceaoeoceooceoaaoeceoaecoea";
        int number = 0;
        for( int i = 0; i < a.length(); i++){
            if(a.charAt(i) == a.charAt(a.length() - 1 - i)){
                number++;
            }
        }if(number == (a.length() / 2)){
            System.out.println(a.charAt(31));
        }
        else
            System.out.println(a.charAt(25));
    }
}
