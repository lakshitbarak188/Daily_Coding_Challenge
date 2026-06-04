public class Problem_121 {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0]; int ans =0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>minPrice){
                ans= Math.max(ans,prices[i]-minPrice);
            }else{
                minPrice=prices[i];
            }
        }
        return ans;
    }
}
