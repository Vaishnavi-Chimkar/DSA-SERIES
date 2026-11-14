class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i <= rowIndex ; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++){
                if(j == 0 || i == j){
                    row.add(1);
                }else{
                    int sum = ans.get(i-1).get(j-1)+ans.get(i-1).get(j);
                    row.add(sum);
                }
            }
            ans.add(row);
        }
        return ans.get(rowIndex);
    }
}