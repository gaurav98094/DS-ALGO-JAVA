class Solution {
    public void moveZeroes(int[] nums) {
        int curr = 0;
        int lo = 0;
        
        for(curr=0;curr<nums.length;curr++){
            if(nums[curr]!=0){
                int tmp = nums[lo];
                nums[lo]=nums[curr];
                nums[curr]=tmp;
                lo++;
            }
                
        }  
    }
}