public int Numberof1(int n){
	int cnt=0;
	while(n!=0){
		cnt++;
		n&=(n-1);
		//res+=n&1;//��1ȡ����
        //n>>=1;//ȥ��1
	}
	return cnt;
}