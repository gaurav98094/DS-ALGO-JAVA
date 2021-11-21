class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> li = new ArrayList();
        for(int i=0;i<nums.length;i++){
            int n = Math.abs(nums[i]);
            if(nums[n-1]<0)
                li.add(n);
            else
                nums[n-1]*=-1;
        }
        
        //System.out.println(Arrays.toString(nums));
        return li;
    }
}