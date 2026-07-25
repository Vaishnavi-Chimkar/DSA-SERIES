class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int selectPairCount = 1;
        int previousPair = pairs[0][1];
        for(int i = 1 ; i < pairs.length ;i++){
            if(pairs[i][0] > previousPair){
                selectPairCount++;
                previousPair = pairs[i][1]; 
            }
        } 

        return selectPairCount;  
    }
}