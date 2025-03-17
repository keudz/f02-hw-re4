package buoi8;

public class tim_ky_tu_xuat_hien_nhieu_nhat {
    public static void main(String[] args) {
        String n ="o1YL9F6TIEHt2kqnIB6ZD8mcx6Qk6cCs31miF1kbCsiiP71kfmbbkThJXFYDElVZfESZWqgyCxk3GozgdtxOglgoEfmt60xGAHbt";
        char maxx ='s';
        int max = -1;
        int []number = new int [n.length()];
        for(int i = 0 ; i < n.length() - 1 ; i++){
            number[i] = 0;
            for(int j = i + 1 ; j < n.length() ; j++){
                if(n.charAt(i) == n.charAt(j)){
                   number[i]++;
                }
            }
        }for(int i = 0 ; i < n.length() ; i++){
            if(number[i] > max){
                max = number[i];
                maxx = n.charAt(i) ;
            }

        }
        System.out.println(maxx);

    }
}
