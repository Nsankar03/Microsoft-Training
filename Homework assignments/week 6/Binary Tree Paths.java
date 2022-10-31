class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> str=new ArrayList<String>();
        if(root!=null)
        {
            formPath(root,"",str);
        }
        return str;
    }
    public void formPath(TreeNode root,String path,List<String> str)
    {
        if(root.left==null && root.right==null) str.add(path+root.val);
        if(root.left!=null)formPath(root.left,path+root.val+"->",str);
        if(root.right!=null)formPath(root.right,path+root.val+"->",str);
    }
}