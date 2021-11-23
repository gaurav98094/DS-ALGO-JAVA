class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        ans = ''
        st=''
        
        for x in s:
            if x in st:
                z=st.index(x)
                if len(st)>len(ans):
                    ans=st
                st=st[z+1:]+x
            else:
                st=st+x
        
        if len(st)>len(ans):
            ans=st
            
        return len(ans)
        