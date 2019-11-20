//递归
public ListNode ReverseList(ListNode head){
	if(head == null || head.next == null)
		return head;
	ListNode next=head.next;
	head.next = null;
	ListNode newHead = ReverseList(next);
	next.next = head;
	return newHead;
}

//头插法
public ListNode ReverseList(ListNode head){
	ListNode newList=new ListNode(-1);
	while(head!=null){
		ListNode next=head.next;//保存下一个值
		head.next=newList.next;//断开
		newList.next=head;
		head=next;
	}
	return newList.next;
}