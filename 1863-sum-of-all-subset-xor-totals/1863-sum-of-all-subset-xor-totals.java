class Solution {
    public int helper(int nums[],int i,int ans){
        if(i == nums.length){
            return ans;
        }
        int take = helper(nums,i+1,ans^nums[i]);
        int notTake = helper(nums,i+1,ans);
        return take+notTake;
    }
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
}