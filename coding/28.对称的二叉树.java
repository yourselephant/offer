boolean isSymmetrical(TreeNode pHead){
	if(pHead == null)
		return true;
	return isSubtreeSymmetrical(pHead.left,pHead.right);
}

boolean isSubtreeSymmetrical(TreeNode t1,TreeNode t2){
	if(t1==null && t2==null)
		return true;
	if(t1==null || t2==null)
		return false;
	if(t1.val != t2.val;
		return false;
	return isSubtreeSymmetrical(t1.left,t2.right) && isSubtreeSymmetrical(t1.right,t2.left);
}