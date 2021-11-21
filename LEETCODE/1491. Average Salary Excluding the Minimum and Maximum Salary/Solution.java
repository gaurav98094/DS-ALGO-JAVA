class Solution {
    public double average(int[] salary) {
        
        int sum=0;
        int min = Integer.MAX_VALUE;
        int max = 0;
        
        for(int i=0;i<salary.length;i++){
            min = Math.min(min,salary[i]);
            max = Math.max(max,salary[i]);
            sum+=salary[i];
        }
        
        return (sum-min-max)/(1.0*(salary.length-2));
    }
}