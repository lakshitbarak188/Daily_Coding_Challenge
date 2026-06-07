package Day_7;

public class Problem_930 {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return withSumLess(nums,goal)-withSumLess(nums,goal-1);
    }
    public int withSumLess(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int l=0;int sum=0;int ans=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            ans += r-l+1;
        }
        return ans;
    }
}
