class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxi = 0;
        for(int i=0;i<candies.length;i++)
           maxi = Math.max(maxi,candies[i]);
        
        List<Boolean> li = new ArrayList();
        
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=maxi)
                li.add(true);
            else
                li.add(false);
        }
        return li;
    }
}