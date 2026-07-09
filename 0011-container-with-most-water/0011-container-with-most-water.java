class Solution {
    public int maxArea(int[] height) {

        int maxWater = Integer.MIN_VALUE;

        int lh = 0;
        int rh = height.length-1;

        while(lh<rh){
            int ht = Math.min(height[lh],height[rh]);
            int width = rh - lh;
            int currWater = ht*width;
            maxWater = Math.max(currWater,maxWater);

            if(height[lh]<height[rh]){
                lh++;
            }else{
                rh--;
            }
        } 

        return maxWater;
    }
}