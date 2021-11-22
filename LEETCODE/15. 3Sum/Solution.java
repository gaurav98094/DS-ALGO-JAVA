class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        int i=0;
        
        while(i<nums.length-2){
            
            int start = i+1;
            int end = nums.length-1;
            
            while(start<end){
                int sum = nums[i] + nums[start] + nums[end];
        
                if(sum>0){
                    end--;
                }else if(sum<0){
                    start++;
                }else{
                    List<Integer> ob = new ArrayList<>();
                    ob.add(nums[i]);
                    ob.add(nums[start]);
                    ob.add(nums[end]);
                    
                    ans.add(ob);
                    start++;
                    
                    while(start<end && nums[start]==nums[start-1])
                        start++;
                }
            }
            
            
            while(i<nums.length-2 && nums[i]==nums[i+1])
                i++;
            i++; 
            
            //System.out.println(i);
        }
        
        return ans;
        
        
    }
}