public void print1ToMaxofNDigits(int n){
	if(n<=0)
		return;
	char[] number=new char[n];
	print1ToMaxofNDigits(number,0);
}

private void print1ToMaxofNDigits(char[] number,int digit){
	if(digit == number.length){
		printNUmber(number);
		return;
	}
	for(int i=0;i<10;i++){
		number[digit] = (char)(i+'0');
		print1ToMaxofNDigits(number,digit + 1);
	}	
}

private void printNumber(char[] nummber){
	int index=0;
	while(index<number.length && number[index] == '0')
		index++;
	while(index<number.length)
		System.out.print(number[index++]);
	System.out.println();
}