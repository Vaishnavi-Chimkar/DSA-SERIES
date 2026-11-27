class Solution {
    public int countVowel(String s){
        int count = 0; 
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                count++;
            }
        }
        return count;
    } 
    public boolean halvesAreAlike(String s) {
       int n = s.length();
       String a = s.substring(0,n/2).toLowerCase();
       String b = s.substring(n/2,n).toLowerCase();
       int count1 = countVowel(a); 
       int count2 = countVowel(b);
       return count1 == count2;
    }
}