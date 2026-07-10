class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public void findSubset(int[] nums,List<Integer> ans,int i){
        if(i == nums.length){
            answer.add(new ArrayList<>(ans));
            return;
        }
        //include
        ans.add(nums[i]);
        findSubset(nums,ans,i+1);
        //undo the inclusion
        ans.remove(ans.size()-1);
        //Exclude
        findSubset(nums,ans,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        findSubset(nums,new ArrayList<>(),0);
        return answer;
    }
}