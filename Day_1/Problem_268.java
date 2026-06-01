package Day_1;

public class Problem_268 {
    public int missingNumber(int[] nums) {
        int i =0 ;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i]==nums.length || i == correct){
                i++;
            }else{
                int temp = nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }
}
