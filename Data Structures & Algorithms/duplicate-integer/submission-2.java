class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueNum = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if (uniqueNum.contains(nums[i])) {
                return true;                
            }else{
                uniqueNum.add(nums[i]);
            }
        }
        return false;
    }
}