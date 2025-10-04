

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][]arr={
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        zero(arr);
        for (int[] m : arr) {
            for (int var  : m) {
                System.out.print(var+" ");
            }
            System.out.println();
        }
    }
    static void zero(int[][]arr){
        int m=arr.length;
        int n=arr[0].length;
        boolean[] zerorow = new boolean[m];
        boolean[] zerocol = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j]==0) {
                    zerorow[i] = true;
                    zerocol[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (zerorow[i] || zerocol[j]) {
                     arr[i][j]=0;
                }
            }}

    }
}
