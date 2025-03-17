package buoi8;

public class tim_cap_i_j_dau_tien {
    public static void main(String[] args) {
        int[] array1D = {-1118695764, 253936797, 1295064699, -327282956, 1555113638, -1315991583,
                648216999, 770772745, 713874256, 455299402, 1358813637, 2091843618, -156036984, 1837041811,
                -2125395242, 118654761, -47372797, -1462823794, 531069097, 1209960809, -1462348147,
                779976684, 1323245109, -2096539217, -1519814521, 498650504, -1488888866, 413310020, 193185533, 1063121171};
        int input = 1181775932;
        int number = 0;
        for(int i = 0; i < array1D.length; i++){
            for(int j = 0; j < array1D.length; j++){
                if(array1D[i] + array1D[j] == input){
                    System.out.println(i + j);
                    return;

                }
            }
        }
    }
}
