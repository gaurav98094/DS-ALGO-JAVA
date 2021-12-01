class Solution {
    public boolean isPalindrome(String s) {
        
        if(s == null || s.length() == 0) return true; 
        
        
        
        int i = 0 ;
        int j = s.length()-1;
        
        while(i <= j){
            
            if( !( Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)) )  ){
                i++;
            }else if( !( Character.isDigit(s.charAt(j)) || Character.isLetter(s.charAt(j)) ) ){
                j--;
            }else{
                
                if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                    
                    return false;
                }
                i++;
                j--;
                
            }
            
        }
        
        return true;
        
    
    }
    
    
}