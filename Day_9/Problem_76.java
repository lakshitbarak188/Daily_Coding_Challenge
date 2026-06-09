package Day_9;

public class Problem_79 {
    public String minWindow(String s, String t) {
        int[] map = new int[256];
        for(int i=0;i<t.length();i++){
            map[t.charAt(i)] +=1;
        }
        int l=0;int minLen = Integer.MAX_VALUE;int start=-1;int count=0;
        for(int r=0;r<s.length();r++){
            if(map[s.charAt(r)]>0){
                count++;
            }
            while(count==t.length()){
                if(r-l+1 < minLen){
                    minLen = r-l+1;
                    start=l;
                }
                map[s.charAt(l)] += 1;
                if(map[s.charAt(l)]>0){
                    count--;
                }
                l++;
            }
            map[s.charAt(r)] -= 1;
        }
        if(start == -1){
            return "";
        }
        return s.substring(start,start+minLen);
    }
}
