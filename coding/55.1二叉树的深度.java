public int TreeDepth(TreeNode root) {
	return root == null ? 0 : 1 + Math.max(TreeDepth(root.left),TreeDepth(root.right));