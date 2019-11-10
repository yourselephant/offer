public int Numberof1(int n){
	int cnt=0;
	while(n!=0){
		cnt++;
		n&=(n-1);
		//res+=n&1;//把1取出来
        //n>>=1;//去掉1
	}
	return cnt;
}