class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;
        for(int i:piles){
            r = Math.max(r, i);
        }
        while(l<r){
            int mid = l + (r-l) /2;
            long hrsneed = 0;
            for (int j:piles){
                hrsneed += (j+mid -1)/mid;
            }
            if(hrsneed <= h){
                r = mid;
            }else{
                l = mid +1;
            }
        }
        return l;
    }
}
