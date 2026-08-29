class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int ans[][] = new int[intervals.length][2];

        ans[0][0] = intervals[0][0];
        ans[0][1] = intervals[0][1];
        
        int j = 0;

        for(int i = 1 ; i< intervals.length ; i++){
            if(ans[j][1] >= intervals[i][0]){
                ans[j][1] = Math.max(ans[j][1],intervals[i][1]);
            }else{
                j++;
                ans[j][0] = intervals[i][0];
                ans[j][1] = intervals[i][1];
            }
        }

        return Arrays.copyOf(ans,j+1);

    }
}