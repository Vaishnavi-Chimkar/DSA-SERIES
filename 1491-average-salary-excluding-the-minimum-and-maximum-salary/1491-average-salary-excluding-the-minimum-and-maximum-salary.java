class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int n = salary.length-2;
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum += salary[i];
        }
        return (double)sum/n;
    }
}