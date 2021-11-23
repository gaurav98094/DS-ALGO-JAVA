class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        chk = strs[0]
        
        ans = ""
        
        for i,x in enumerate(chk):
            flag = 0
            for z in strs:
                if len(z)<=i or z[i]!=x:
                    flag=1
                    break
                    
            if flag==0:
                ans+=x
            else:
                break
        
        return ans
            
        