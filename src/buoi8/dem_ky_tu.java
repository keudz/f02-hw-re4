package buoi8;

public class dem_ky_tu {
        public static void main(String[] args) {

            String a = "3c6b9a0e8d3a9c8o0e9b83d60eab9bcd6o8a0e6c3b9a98c3dbe0o803e6cba98d60o39a0e6cb98a3dbe0o3c8d960eb9a6";


            int x = 0;
            int y = 0;

            for(char c : a.toCharArray()){
                if(Character.isDigit(c)){
                x++;
                }
            else if (Character.isLetter(c)){
                y++;
                }
            }



            int kq = (x + y) % 7;

            // In kết quả
            System.out.println("Số ký tự chữ (x): " + y);
            System.out.println("Số ký tự số (y): " + x);
            System.out.println("Kết quả (x + y) % 7: " + kq);
        }
    }


