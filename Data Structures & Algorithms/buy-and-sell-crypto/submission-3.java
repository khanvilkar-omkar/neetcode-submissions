class Solution {
    public int maxProfit(int[] prices) {
        int l =0;
        int r=1;
        int max =0;

        while(r<prices.length){
            int diff = prices[r]-prices[l];
            if(diff>max){
                max = diff;
            }
            if(prices[l]>prices[r]){
                l=r;
            }
            r++;
        }
        return max;
    }
}
