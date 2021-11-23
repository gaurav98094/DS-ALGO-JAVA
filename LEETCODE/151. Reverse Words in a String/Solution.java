class Solution {
    public String reverseWords(String s) {
        
        s=s+" ";
        String ans = "";
        String tmp="";
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch==' '){
                if(tmp!=" " && tmp!=""){
                    ans = tmp+" "+ans;
                    tmp="";
                }
                
                
            }else{
                tmp=tmp+ch;
            }
            
        }
        
        return ans.trim();
        
        
    }
}