/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int[] findTiltHelper(TreeNode root) {
        
        if(root==null){
            int ans[]=new int[2];
            ans[0]= 0;
            ans[1]=0;
            return ans;
        }

        int lans[] = findTiltHelper(root.left);
        int rans[] = findTiltHelper(root.right);
        int val = root.val + lans[0] + rans[0];
        
        int newVal = Math.abs(lans[0]-rans[0]);
        int sum=lans[1]+rans[1]+newVal;
        
        int ans[]=new int[2];
        ans[0]= val;
        ans[1]=sum;
        
        
        return ans;
    }
    
    
    public int findTilt(TreeNode root) {
        int ans[] = findTiltHelper(root);
        return ans[1];
    }
    
    
    
}