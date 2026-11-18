class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i = 2 ; i < arr.length; i++){
            int currdiff = arr[i]-arr[i-1];
            if(diff != currdiff){
                return false;
            }
        }
        return true;
    }
}