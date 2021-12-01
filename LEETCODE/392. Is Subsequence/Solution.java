class Solution {
    public boolean isSubsequence(String s, String t) {
     
        
        int l1 = s.length();
        int l2 = t.length();
        
        
        int i=0;
        int j=0;
        
        while(i<l1 && j<l2){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(j);
            
            if(ch1==ch2){
                i++;
                j++;
            }else{
                j++;
            }
        }
        
        
        if(i==l1)
            return true;
        return false;
        
    }
}