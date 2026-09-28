class Solution {
    public int maximumValue(String[] strs) {
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0 ; i < strs.length ; i++ ){
            int currValue;
            if(strs[i].matches("[0-9]+")){
                currValue = Integer.parseInt(strs[i]);
            }else{
                currValue = strs[i].length();
            }
            maxLen = Math.max(maxLen,currValue);
        }
        return maxLen;
    }
}