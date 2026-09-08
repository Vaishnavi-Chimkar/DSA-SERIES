class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i < nums1.length ; i++){
            set.add(nums1[i]);
        }

        int ans[] = new int[nums1.length];
        int j = 0;
        for(int i = 0 ; i < nums2.length  ; i++){
            if(set.contains(nums2[i])){
                ans[j] = nums2[i];
                set.remove(nums2[i]);
                j++;
            }
        }

        return Arrays.copyOf(ans,j);
    }
}