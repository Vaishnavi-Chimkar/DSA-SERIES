
class Solution {
    public int findDuplicate(int[] nums) {        
        int slow = nums[0];
        int fast = nums[0];
        //cycle detect
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        //detect duplicate 
        slow = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}