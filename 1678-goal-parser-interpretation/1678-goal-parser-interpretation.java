class Solution {
    public String interpret(String command) {
       StringBuilder res = new StringBuilder();
       int i = 0;
       while(i < command.length()){
            if(command.charAt(i)=='G'){
                res.append("G");
                i++;
            }else if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                res.append("o");
                i = i+2;
            }else{
                res.append("al");
                i = i+4;
            }
        }
        return res.toString();
    }
}