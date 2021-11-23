class Solution {
    public int lengthOfLongestSubstring(String s) {
        String ans="";
        String st="";
        
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            
            int ind = st.indexOf(ch);
            //System.out.println(ind);
            
            if(ind==-1){
                st = st+ch;
            }else{
                if(st.length()>ans.length()){
                    ans=st;
                    System.out.println(ans);
                }
                st = st.substring(ind+1)+ch;
            }
            
        }
        
        if(st.length()>ans.length())
                ans=st;
        
        return ans.length();
    }
}