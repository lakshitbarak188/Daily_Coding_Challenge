package Day_5;

import java.util.HashMap;

public class Problem_3 {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0; int maxLen =0;
        for(int r=0;r<s.length();r++){
            if(map.getOrDefault(s.charAt(r),0)+1>1){
                while(s.charAt(l)!=s.charAt(r)){
                    map.remove(s.charAt(l));
                    l++;
                }
                l++;
            }else{
                maxLen=Math.max(maxLen,r-l+1);
            }
            map.put(s.charAt(r),1);
        }
        return maxLen;
    }
}
