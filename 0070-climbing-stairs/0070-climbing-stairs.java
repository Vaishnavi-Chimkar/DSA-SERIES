class Solution {
    public int countWays(int ways[],int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(ways[n] != 0){
            return ways[n];
        }
        ways[n] = countWays(ways,n-1)+countWays(ways,n-2);
        return ways[n];
    }
    public int climbStairs(int n) {
        int ways[] = new int[n+1];        return countWays(ways,n);
    }
}