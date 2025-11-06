public class LeetCode1{
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9;
        int[] res={};
        for(int i =0; i<nums.length;i++){
            for(int j = 1; j<nums.length;j++){
                if(nums[j]==(target-nums[i]) && i!=j){
                  res = new int[]{i,j} ;  
                }
            }
        }
        System.out.print(res[0] + " " + res[1]);
    }
}
