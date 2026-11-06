class Solution {
    public List<String> summaryRanges(int[] nums) {
        int start = 0 ;
        List<String> ans = new ArrayList<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(i == nums.length -1 || nums[i+1] != nums[i]+1){
                if(start == i){
                    ans.add(String.valueOf(nums[start]));
                }else{
                    ans.add(nums[start]+"->"+nums[i]);
                }
                start = i+1;
            }
        }
        return ans;
    }
}