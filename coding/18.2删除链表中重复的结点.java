public ListNode deleteDuplication(ListNode pHead){

	if(pHead == null || pHead.next == null)// ֻ��0����1����㣬�򷵻�
		return pHead;
	ListNode next = pHead.next;
	if(pHead.val == next.val){// ��ǰ������ظ����
		while(next != null && pHead.val == next.val)
		{// ����ֵ�뵱ǰ�����ͬ��ȫ�����,�ҵ���һ���뵱ǰ��㲻ͬ�Ľ��
			next = next.next;
		}
		return deleteDuplication(next);// �ӵ�һ���뵱ǰ��㲻ͬ�Ľ�㿪ʼ�ݹ�
	}else{// ��ǰ��㲻���ظ����
		pHead.next = deleteDuplicate(pHead.next);// ������ǰ��㣬����һ����㿪ʼ�ݹ�
		return pHead;
	}
}