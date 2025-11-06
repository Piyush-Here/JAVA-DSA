public class LeetCode485{
    public static void main (String[] args){
        int[] nums = {1,1,0,1,1,1};

        int max=0,count=0;

        if(nums.length==1){
            System.out.print(nums[0]);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }else{
                if(max<=count){
                    max=count;
                }
                count=0;
            }
        }
        if(count>=max){
            max=count;
        }

        System.out.print(max);

    }
}