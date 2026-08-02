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
    // static class Info{
    //     int diameter;
    //     int height;

    //     Info(int diameter,int height){
    //         this.diameter = diameter;
    //         this.height = height;
    //     }
    // }
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh,rh)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null){
            return 0;
        }

        int ldiam = diameterOfBinaryTree(root.left);
        int lht = height(root.left);
        int rdiam = diameterOfBinaryTree(root.right);
        int rht = height(root.right);

        int selfdiam = lht+rht;

        return Math.max(selfdiam,Math.max(ldiam,rdiam));

        // if(root == null){
        //     return new Info(0,0);
        // }

        // Info leftinfo = diameterOfBinaryTree(root.left);
        // Info rightinfo = diameterOfBinaryTree(root.right);

        // int diam = Math.max(Math.max(leftinfo.diameter,rightinfo.diameter),leftinfo.height+rightinfo.height);

        // int ht = Math.max(leftinfo.height,rightinfo.height)+1;

        // return new Info(diam,ht);
    }
}