public class CustomerWealth {
    public static void main(String[] args) {
        int[][]arr={
            {1,2,3},
            {4,1,6},
            {3,3,7}
        };
        System.out.println(total(arr));
    }
    static int total(int[][] arr){
        int ans=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[i].length; j++) {
                sum+=arr[i][j];
                
            }
            
            if (sum>ans) {
                ans = sum;
        }
        }
        return ans;
    }
    
}