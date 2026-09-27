class Solution {
    public int findNumbers(int[] nums) {
        int evenDigit = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int num = nums[i];
            int currCount = 0;
            while(num > 0 ){
                num/=10;
                currCount++;
            }
            if(currCount%2==0){
                evenDigit++;
            }
        }
        return evenDigit;
    }
}