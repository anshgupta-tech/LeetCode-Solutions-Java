public class SortColor {
    public static void main(String[] args) {
        int[] arr = {2,1,0,1,2,0};
        sort(arr);
        for (int n : arr) {
            System.out.print(n + " ");
            
        }
    }
    static void sort(int[]arr ){
        int start = 0 ;
         int mid = 0 ;
         int end = arr.length -1;
        while (mid<= end) {
            if (arr[mid]==0) {
                int temp = arr[start];
                arr[start] = arr[mid];
                arr[mid]= temp;
                start ++;
                mid++;
            }
            else if (arr[mid]==1) {
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
    }
}
