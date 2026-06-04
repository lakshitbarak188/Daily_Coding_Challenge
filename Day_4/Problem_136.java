package Day_4;

import java.util.HashMap;

public class Problem_136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.remove(nums[i]);
            }else{
                map.put(nums[i],i);
            }
        }
        return map.keySet().iterator().next();
    }
}
