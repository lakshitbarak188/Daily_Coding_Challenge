package Day_8;

public class Problem_1248 {
    public int numberOfSubarrays(int[] nums, int k) {
        return lessThanK(nums,k) - lessThanK(nums,k-1);
    }
    public int lessThanK(int[] nums , int k){
        int l=0;int count=0;int ans=0;
        for(int r=0;r<nums.length;r++){
            if(isOdd(nums[r])){
                count++;
            }
            while(count>k){
                if(isOdd(nums[l])){
                    count--;
                }
                l++;
            }
            ans+= r-l+1;
        }
        return ans;
    }
    public boolean isOdd(int num){
        if(num==0){
            return false;
        }
        if(num%2==0){
            return false;
        }
        return true;
    }
}
