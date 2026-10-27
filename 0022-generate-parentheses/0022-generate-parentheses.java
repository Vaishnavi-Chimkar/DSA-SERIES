class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        backtrack("",0,0,n,res);
        return res;
    }

    void backtrack(String s,int open,int close,int n,ArrayList<String> ans){
        if(s.length() == n*2){
            ans.add(s);
            return;
        }

        if(open < n){
            backtrack(s+"(",open+1,close,n,ans);
        }
        if(close < open){
            backtrack(s+")",open,close+1,n,ans);
        }
    }
}