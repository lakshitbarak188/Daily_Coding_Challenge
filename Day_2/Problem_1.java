import java.util.HashMap;

public class Problem_1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(maps.containsKey(complement)){
                return new int[]{maps.get(complement),i};
            }
            maps.put(nums[i],i);
        }
        return new int[]{};
    }
}
