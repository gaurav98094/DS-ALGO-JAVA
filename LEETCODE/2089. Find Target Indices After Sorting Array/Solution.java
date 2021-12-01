class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        int ct = 0;
        int lt = 0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ct++;
            }
            
            if(nums[i]<target)
                lt++;
        }
        
        ArrayList<Integer> li = new ArrayList<Integer>();
        
        for(int i=0;i<ct;i++){
            li.add(lt++);
        }
        
        return li;
        
    }
}