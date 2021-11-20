class Solution {
    public int[] plusOne(int[] digits) {
        
        int carry = 1;
        int l = digits.length;
        
        for(int i=l-1;i>=0;i--){
            int sum = digits[i]+carry;
            int put = sum%10;
            carry = sum/10;
            digits[i]=put;
        }
        
        
        if(carry!=0){
            int ans[] = new int[l+1];
            ans[0]=carry;
            
            for(int i=1;i<=l;i++)
                ans[i]=digits[i-1];
            
            return ans;
        }
        return digits;
        
        
    }
}