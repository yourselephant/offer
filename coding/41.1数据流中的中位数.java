private PriorityQueue<Integer> left = new PriorityQueue<>((o1,o2) -> o2-o1);
private PriorityQueue<Integer> right = new PriorityQueue<>();
private int N = 0;

public void Insert(Integer val) {
    /* ����Ҫ��֤�����Ѵ���ƽ��״̬ */
    if (N % 2 == 0) {
        /* N Ϊż��������²��뵽�Ұ�ߡ�
         * ��Ϊ�Ұ��Ԫ�ض�Ҫ�������ߣ������²����Ԫ�ز�һ��������Ԫ�����Ĵ�
         * �����Ҫ�Ƚ�Ԫ�ز������ߣ�Ȼ����������Ϊ�󶥶ѵ��ص㣬ȡ���Ѷ�Ԫ�ؼ�Ϊ���Ԫ�أ���ʱ�����Ұ�� */
        left.add(val);
        right.add(left.poll());
    } else {
        right.add(val);
        left.add(right.poll());
    }
    N++;
}

public Double GetMedian() {
    if (N % 2 == 0)
        return (left.peek() + right.peek()) / 2.0;
    else
        return (double) right.peek();
}
