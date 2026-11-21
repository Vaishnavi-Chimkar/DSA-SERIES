class Solution {
    public boolean checkString(String s) {
        boolean appear = false;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='a'){
                if(appear == true){
                    return false;
                }
            }else{
                appear = true;
            }
        }

        return true;
    }
}