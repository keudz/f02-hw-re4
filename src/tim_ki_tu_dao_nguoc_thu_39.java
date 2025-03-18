package buoi8;

public class tim_ki_tu_dao_nguoc_thu_39 {
    public static void main(String[] args) {
        String n = "o1YL9F6TIEHt2kqnIB6ZD8mcx6Qk6cCs31miF1kbCsiiP71kfmbbkThJXFYDElVZfESZWqgyCxk3GozgdtxOglgoEfmt60xGAHbt";


        for(int i = n.length() - 1 ; i >= 0  ; i--){
            if(i == (n.length() - 40)){
                System.out.print(n.charAt(i));
                System.out.print("\n");

            }

        }
    }
}
