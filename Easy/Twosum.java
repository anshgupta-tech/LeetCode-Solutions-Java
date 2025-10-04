package Easy;

public class Twosum {
    static int[] twosum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int[]nums ={2,7,11,15,18};
        int target=9;
        int[]ans=twosum(nums, target);
        System.out.println((ans.length>0 ? ans[0]+","+ans[1]:"No solution"));
    }
}
