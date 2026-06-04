package Day_4;

import java.util.HashMap;
import java.util.Map;

public class Problem_169 {
    public int majorityElement(int[] nums) {
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()>nums.length/2){
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
