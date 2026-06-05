package Day_5;

public class Problem_485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;int ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==0){
                l=r+1;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
