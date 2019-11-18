public void reOrderArray(int[] nums){
	int N=nums.length;
	for(int i=N-1;i>0;i--){
		for(int j=0;j<i;j++){
			if(isEven(nums[j]) && isEven(nums[j+1])){
				swap(nums,j,j+1);
			}
		}
	}
}

private boolean isEven(){
	return i%2 == 0;
}

private void swap(int[] arr,int i,int j){
	int temp=arr[i];
	arr[i]=arr[j];
	arr[j]=temp;
}