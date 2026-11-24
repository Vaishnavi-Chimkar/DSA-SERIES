class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        String resArr[] = new String[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            String word = arr[i];
            int idx = word.charAt(word.length()-1)-'0';
            resArr[idx-1] = word.substring(0,word.length()-1);
        }
        String res = String.join(" ", resArr);
        return res;
    }
}