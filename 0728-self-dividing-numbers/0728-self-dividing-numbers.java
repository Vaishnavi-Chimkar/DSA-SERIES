class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();
        for(int i = left ; i <= right ; i++){
            int n = i;
            boolean valid = true;
            while(n > 0){
                int rem = n%10;
                //digit 0 cannot divide the number
                if(rem == 0 || i % rem != 0){
                    valid = false;
                    break;
                }
                n/=10;
            }
            if(valid){
                ans.add(i);
            }
        }
        return ans;
    }
}