class Solution {
    static class rank{

        int score;
        int idx;

        public rank(int score,int idx){
            this.score = score;
            this.idx = idx;
        }
    }
    public String[] findRelativeRanks(int[] score) { 

        String[] ans = new String[score.length];

        PriorityQueue<rank> p = new PriorityQueue<>(
            (a,b) -> b.score-a.score
        );

        for(int i = 0 ; i<score.length ; i++){
            p.add(new rank(score[i],i));
        }

        int pos = 1;
        while(!p.isEmpty()){
            rank curr = p.remove();
            if(pos == 1){
                ans[curr.idx] = "Gold Medal";
            }else if(pos == 2){
                ans[curr.idx] = "Silver Medal";
            }else if(pos == 3){
                ans[curr.idx] = "Bronze Medal";
            }else{
                ans[curr.idx] = Integer.toString(pos);
            }
            pos++;
        }
        return ans;
    }
}