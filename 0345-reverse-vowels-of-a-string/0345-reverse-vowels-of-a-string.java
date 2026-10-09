class Solution {
    static class Pair{
        char ch;
        int i;
        public Pair(char ch,int i){
            this.ch = ch;
            this.i = i;
        }
    }
    public String reverseVowels(String s) {
        ArrayList<Pair> p = new ArrayList<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='A' || ch=='e'|| ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
                p.add(new Pair(ch,i));
            }
        }
        char[] arr = s.toCharArray();

        int left = 0;
        int right = p.size()-1;

        while(left < right){
            arr[p.get(left).i] = p.get(right).ch;
            arr[p.get(right).i] = p.get(left).ch;
            left++;
            right--;
        }

        return new String(arr);
    }
}