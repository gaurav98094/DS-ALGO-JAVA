class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i,x in enumerate(nums):
            z = target - x
            if z in nums[i+1:]:
                for j in range(i+1,len(nums)):
                    if nums[j]==z:
                        break
                break
        return [i,j]
        
        
        z1 = nums.index(n[i])
        z2 = nums.index(n[j])
        return [z1,z2]
            
        