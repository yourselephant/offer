public int getDigitAtIndex(int index) {
	if(index < 0)
		return -1;
	int place = 1;
	while(true){
		int amount = getAmountOfPlace(place);
		int totalAmount = amount * place;
		if(index < totalAmount)
			return getDigitAtIndex(index,place);
		index -= totalAmount;
		place++;
	}
}

private int getAmountOfPlace(int place) {
	if(place == 1)
		return 10;
	return (int)Math.pow(10,place-1) * 9;
}

private int getBeginNumberOfPlace(int place) {
	if(place == 1)
		return 0;
	return (int)Math.pow(10,place-1);
}

private int getDigitAtIndex(int index, int place) {
	int beginNumber = getBeginNumberOfPlace(place);
	int shiftNumber = index/place;
	String number = index % place;
	return number.charAt(count) - '0';
}





