class Solution {
    public int xorOperation(int n, int start) {
        int result = 0;
        int i = 0;
        while(i < n){
            result ^= start+2*i;
            i++;
        }
        return result;
    }
}