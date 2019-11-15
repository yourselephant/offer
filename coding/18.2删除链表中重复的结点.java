public ListNode deleteDuplication(ListNode pHead){

	if(pHead == null || pHead.next == null)// 只有0个或1个结点，则返回
		return pHead;
	ListNode next = pHead.next;
	if(pHead.val == next.val){// 当前结点是重复结点
		while(next != null && pHead.val == next.val)
		{// 跳过值与当前结点相同的全部结点,找到第一个与当前结点不同的结点
			next = next.next;
		}
		return deleteDuplication(next);// 从第一个与当前结点不同的结点开始递归
	}else{// 当前结点不是重复结点
		pHead.next = deleteDuplicate(pHead.next);// 保留当前结点，从下一个结点开始递归
		return pHead;
	}
}