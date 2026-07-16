class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //next greater find for all element in num2 arr
        Stack<Integer> s = new Stack<>();
        int nsr[] = new int[nums2.length];
        for(int i = nums2.length-1;i>=0;i--){
            while(!s.isEmpty() && nums2[s.peek()]<nums2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = -1;
            }else{
                nsr[i] = nums2[s.peek()];
            }

            s.push(i);
        }

        int result[] = new int[nums1.length];
        for(int i = 0 ;i<nums1.length;i++){
            int ch = nums1[i];
            for(int j = 0;j<nums2.length;j++){
                if(ch == nums2[j]){
                    result[i] = nsr[j];
                    break;
                }
            }
        }

        return result;
    }
}