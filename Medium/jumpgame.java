public class jumpgame {
public static void main(String[] args) {
    int[]arr={2,3,1,1,4};
    System.out.println(canjump(arr));
}
    static boolean canjump(int[]arr){
        int maxreach =0;
        for(int i=0;i<arr.length;i++){
            if (i>maxreach) {
                return false;
            }
            maxreach= Math.max(maxreach, i+arr[i]);
        }
        return true;
    }

    
}