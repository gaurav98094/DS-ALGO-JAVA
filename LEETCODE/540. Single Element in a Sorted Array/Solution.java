class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l = arr.length;
        
        int lo = 0;
        int hi = l-1;
        
        while(lo<hi){
            int mid = (lo+hi)/2;
            
            if(arr[mid]==arr[mid-1]){
                if(mid%2==0){
                    hi=mid-2;
                }else{
                    lo=mid+1;
                }
            }else if(arr[mid]==arr[mid+1]){
                if(mid%2==0){
                    lo=mid+2;
                }else{
                    hi=mid-1;
                }
            }else{
                return arr[mid];
            }
        }
        return arr[lo];
        
    }
}