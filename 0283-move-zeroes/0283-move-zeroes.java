class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]!=0){
                j++;
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }  
    }
}