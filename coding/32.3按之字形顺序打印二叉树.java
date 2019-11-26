public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(pRoot);
		boolean reverse = false;
		while(!queue.isEmpty()){
			ArrayList<Integer> list = new ArrayList<>();
			int cnt = queue.size();
			while(cnt-- > 0){
				TreeNode node = queue.poll();
				if(node == null)
					continue;
				list.add(node.val);
				queue.add(node.left);
				queue.add(node.right);
			}
			if(reverse)
				Collections.reverse(list);
			reverse = !reverse;
			if(list.size() != 0)
				ret.add(list);
		}
		return ret;
}

	