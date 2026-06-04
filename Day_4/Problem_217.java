package Day_4;

import java.util.HashMap;

public class Problem_217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            int freq = map.getOrDefault(num,0)+1;
            if(freq>1){
                return true;
            }
            map.put(num,freq);
        }
        return false;
    }
}
