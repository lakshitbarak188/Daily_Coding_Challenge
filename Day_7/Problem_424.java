package Day_7;

public class Problem_424 {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0;
        int maxFreq = 0;
        int ans = 0;
        for (int r = 0; r < s.length(); r++) {
            int idx = s.charAt(r) - 'A';
            freq[idx]++;
            maxFreq = Math.max(maxFreq, freq[idx]);
            while ((r - l + 1) - maxFreq > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}
