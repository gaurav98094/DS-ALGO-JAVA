class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            Integer idx = map.get(nums[i]);
            
            if(idx==null)
                map.put(target-nums[i],i);
            else
                return new int[]{idx,i};
        }
        
        return new int[2];
    }
}