package Day_8;

import java.util.HashMap;

public class Problem_992 {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return lessThanK(nums,k) - lessThanK(nums,k-1);
    }
    public int lessThanK(int[] nums,int k){
        int l=0;int ans=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int r=0;r<nums.length;r++){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()>k){
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0){
                    map.remove(nums[l]);
                }
                l++;
            }

            ans += r-l+1;
            
        }
        return ans;
    }
}
