import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(new File("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\input100"));
        //  nhập vào mảng 2 chiều từ màn hình console và in ra console
        double [][]arr = new double[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextDouble();
                System.out.println(arr[i][j]+ " ");
            }
        }sc.close();

        // nhập vào mảng 2 chiều từ màn hình file và in ra file
        PrintWriter pw = new PrintWriter("C:\\Users\\GIAHUYPC\\IdeaProjects\\untitled\\src\\output100");
        double [][]arr1 = new double[3][3];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                arr1[i][j] = sc1.nextDouble();
                pw.println(arr1[i][j]);
            }
        }sc1.close();
        pw.close();
        System.out.println("sum =: "+ sum(arr));

        System.out.println("max =: "+ max(arr));

        System.out.println("min =: "+ min(arr));

        System.out.println("vi tri imin la:" );
        for( double v: imin(arr)){
            System.out.printf(" %.0f ",v);
        }System.out.println("\n");

        System.out.println("vi tri imax la:" );
        System.out.print("(");
        for(double v:imax(arr))
            System.out.printf(" %.0f ",v);
        System.out.println(")");
        System.out.println("\n");

        System.out.println("vt fisrt = n la: ");
        System.out.print("(");
        for(double v:first(arr,8))
            System.out.printf(" %.0f ",v);
        System.out.println(")");
        System.out.println("\n");

        System.out.println("vt last = n la: ");
        System.out.print("(");
        for(double v:last(arr,8))
            System.out.printf(" %.0f ",v);
        System.out.println(")");
        System.out.println("\n");


        System.out.println("mang sau khi dc hoan doiP:");
        hoandoi(arr,1,2,2,2);
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[i].length; j++)
                System.out.printf("%.0f " ,arr[i][j]);



    }
    public static double sum(double[][] arr) {
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
    public static double max(double[][] arr) {
        double max = arr[0][0];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }return max;
    }
    public static double min(double[][] arr) {
        double min = arr[0][0];
        for(int i = 0; i < arr.length; i++) {
            for( int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
    public static double[] imin(double[][] arr) {
        double min = arr[0][0];
        double []minindex = {0,0};
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if( arr[i][j] < min) {
                    min = arr[i][j];
                    minindex[0] = i;
                    minindex[1] = j;
                }
            }
        }
        return minindex;
    }
    public static double[] imax(double[][] arr) {
        double max = arr[0][0];
        double []maxindex = {0,0};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    maxindex[0] = i;
                    maxindex[1] = j;
                }
            }
        }
        return maxindex;
    }
    public static double [] first(double[][] arr,double n) {
        double first = arr[0][0];
        double [] firstindex = {0,0};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == n ){
                    firstindex[0] = i;
                    firstindex[1] = j;
                    return firstindex;
                }

            }
        }
        return new double[]{-1,-1};
    }
    public static double [] last(double[][] arr,double n) {
        double last = arr[0][0];
        double [] lastindex = {0,0};
        double [] lastindex1 = {0,0};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == n ){
                    lastindex[0] = i;
                    lastindex[1] = j;
                }
            }
        }for( int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == n && lastindex[0] == i && lastindex[1] == j ){
                    lastindex1[0] = i;
                    lastindex1[1] = j;
                    return lastindex1;
                }
            }
        }
        return new double[]{-1,-1};

    }
    public static void hoandoi(double[][] arr, int a, int b, int c, int d) {
        double temp = arr[a][b];
        arr[a][b] = arr[c][d];
        arr[c][d] = temp;
    }

}
