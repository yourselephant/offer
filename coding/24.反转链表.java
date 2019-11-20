//�ݹ�
public ListNode ReverseList(ListNode head){
	if(head == null || head.next == null)
		return head;
	ListNode next=head.next;
	head.next = null;
	ListNode newHead = ReverseList(next);
	next.next = head;
	return newHead;
}

//ͷ�巨
public ListNode ReverseList(ListNode head){
	ListNode newList=new ListNode(-1);
	while(head!=null){
		ListNode next=head.next;//������һ��ֵ
		head.next=newList.next;//�Ͽ�
		newList.next=head;
		head=next;
	}
	return newList.next;
}