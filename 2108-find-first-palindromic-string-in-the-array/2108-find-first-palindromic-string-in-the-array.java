class Solution {
    public boolean isPalindrome(String word){
        int start = 0;
        int end = word.length()-1;
        while(start <= end){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0 ; i < words.length ; i++){
            String str = words[i];
            if(isPalindrome(str)){
                return str;
            }
        }
        return "";
    }
}