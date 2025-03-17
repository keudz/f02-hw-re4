package buoi8;

public class VietChuongTrinhLoaiBoCacSoLapLai {
    public static void main(String[] args) {
        int[] arr = {-1336439950, -1336439950, -1627142690, -1627142690, -1627142690, -580008775, 1590173078,
                -540904643, 259998404, 259998404, 1590173078, -1336439950, 1782288190, -580008775, -580008775,
                -580008775, 1782288190, -1080819275, -1627142690, -580008775, -944880215, 259998404, -1627142690,
                -580008775, -580008775, -580008775, 259998404, 1782288190, -580008775, -1336439950};
        int[] newarr = new int[arr.length];
        int index = 0;


        for (int i = 0; i < arr.length; i++) {
            boolean kiemtra = false;
            for (int j = 0; j < index; j++) {
                if (arr[i] == newarr[j]) {
                    kiemtra = true;
                    break;
                }
            }
            if (kiemtra == false) {
                newarr[index++] = arr[i];
            }
        }

        System.out.println(newarr[7]);
    }
}
