class Solution {
    public int signFunc(int x){
        if(x > 0){
            return 1;
        }
        else if(x < 0){
            return -1;
        }
        return 0;
    }
    public int arraySign(int[] nums) {
        int product = 1;
        for(int num : nums){
            if(num == 0){
                return 0;
            }
            if(num < 0){
                product *= -1;
            }
        }
        return signFunc(product);
    }
}