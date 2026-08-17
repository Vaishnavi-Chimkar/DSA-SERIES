class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2*n];  
        int i = 0;
        int j = 1;
        int p1 = 0;
        int p2 = n;
        while(p1<n && p2<nums.length){
            ans[i] = nums[p1];
            ans[j] = nums[p2];
            i = i+2;
            j = j+2;
            p1++;
            p2++;
        }

        return ans;
    }
}