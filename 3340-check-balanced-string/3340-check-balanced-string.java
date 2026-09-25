class Solution {
    public boolean isBalanced(String num) {
        int evenSum = num.charAt(0)-'0', oddSum = 0;
        for(int i = 1 ; i < num.length() ; i++){
            if(i%2==0){
                evenSum+=num.charAt(i)-'0';
            }else{
                oddSum+=num.charAt(i)-'0';
            }
        } 
        return evenSum == oddSum;
    }
}