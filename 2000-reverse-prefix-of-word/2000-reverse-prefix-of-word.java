class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder res = new StringBuilder(word);
        int idx = word.indexOf(ch);
        if(idx == -1){
            return word;
        }
        int start = 0 , end = idx;
        while(start < end){
            char temp = res.charAt(start);
            res.setCharAt(start,res.charAt(end));
            res.setCharAt(end,temp);
            start++;
            end--;
        }

        return res.toString();
    }
}