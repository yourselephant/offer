public boolean isNumeric(char[] str){
	if(str == null || str.length == 0){
		return false;
	}
	return String(str).match("[+-]? \\d* (\\. \\d+)? ([eE][+-]? \\d+)?");