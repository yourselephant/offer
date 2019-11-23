public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
	Queue<TreeNode> queue = new LinkedList<>();
	ArrayList<Integer> ret = new ArrayList<>();
	queue.add(root);
	while(!queue.isEmpty()){
		int cnt=queue.size();
		while(cnt-- > 0){
			TreeNode t=queue.poll();
			if(t==null)
				continue;
			ret.add(t.val);
			queue.add(t.left);
			queue.add(t.right);
		}
	}
	return ret;
}