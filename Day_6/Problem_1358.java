package Day_6;

public class Problem_1358 {
    public int numberOfSubstrings(String s) {
        int[] freq = new int[3];
        int distinct = 0;
        int l = 0;
        int count = 0;
        for (int r = 0; r < s.length(); r++) {
            int idx = s.charAt(r) - 'a';
            if (freq[idx] == 0) {
                distinct++;
            }
            freq[idx]++;
            while (distinct == 3) {
                count += s.length() - r;
                int leftIdx = s.charAt(l) - 'a';
                freq[leftIdx]--;
                if (freq[leftIdx] == 0) {
                    distinct--;
                }
                l++;
            }
        }
        return count;
    }
}
