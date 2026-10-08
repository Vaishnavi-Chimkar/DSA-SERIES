class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        ArrayList<Integer> L = new ArrayList<>();
        for(int i=0; i<nums.length ; i++){
            if(nums[i] == 1){
                L.add(i);
            }
        }

        for(int i = 0 ; i < L.size()-1 ; i++){
            if(L.get(i+1)-L.get(i)-1 < k){
                return false;
            }
        }
        return true;
    }
}