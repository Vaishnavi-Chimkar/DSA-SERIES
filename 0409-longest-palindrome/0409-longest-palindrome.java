class Solution {
    public int longestPalindrome(String s) {
        int palindromeLen = 0;

        if(s.length() == 1){
            return 1;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        boolean oddFound = false;
        for (Character ch : map.keySet()) {
            int freq = map.get(ch);
            if(freq % 2 == 0 ){
                palindromeLen += freq;
            }else{
                palindromeLen += freq-1;
                oddFound = true;
            }
        }

        if(oddFound){
            palindromeLen++;
        }

        return palindromeLen;     
    }
}