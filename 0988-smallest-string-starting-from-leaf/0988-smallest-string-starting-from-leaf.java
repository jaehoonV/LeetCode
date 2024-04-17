class Solution {
    public String smallestFromLeaf(TreeNode root) {
        return func(root,new StringBuilder()).toString();
    }
    
    StringBuilder func(TreeNode root, StringBuilder sb){
        if(root == null) return sb;
        
        sb.append((char)('a' + root.val));
        
        if(root.left == null && root.right == null) return sb.reverse();
        
        StringBuilder sb1 = root.left != null ? func(root.left,new StringBuilder(sb)) : null;
        StringBuilder sb2 = root.right != null ? func(root.right,new StringBuilder(sb)) : null;
        
        if(sb1 != null && sb2 != null) return sb1.toString().compareTo(sb2.toString()) < 0 ? sb1 : sb2;
        else return sb1!=null ? sb1 : sb2;
    }
    
}