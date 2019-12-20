public boolean isContinuous(int[] nums) {

    if (nums.length < 5)
        return false;

    Arrays.sort(nums);

    // ͳ���������
    int cnt = 0;
    for (int num : nums)
        if (num == 0)
            cnt++;

    // ʹ�����ȥ��ȫ��������˳��
    for (int i = cnt; i < nums.length - 1; i++) {
        if (nums[i + 1] == nums[i])
            return false;
        cnt -= nums[i + 1] - nums[i] - 1;
    }

    return cnt >= 0;
}
