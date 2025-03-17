package buoi7;

public class test_tim_kiem_nhi_phan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(tim_kiem_nhi_phan(arr, 3, 0,arr.length - 1  ));
    }
    public static int tim_kiem_nhi_phan(int arr[],int key,int low, int high) {
    if(low > high)
        return -1;
        int mid = (low + high)/2;
        if(arr[mid] > key)
            return tim_kiem_nhi_phan(arr,key, low, mid -1 );
        else if (arr[mid] < key)
         return tim_kiem_nhi_phan(arr,key, mid + 1, high);
        else
            return arr[mid];
    }
}//khi sử dụng tìm kiếm nhị phân thì mảng luôn phải được sắp xếp trước
