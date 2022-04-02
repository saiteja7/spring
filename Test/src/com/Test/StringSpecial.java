package com.Test;

public class StringSpecial {
	
	public static void main(String[] args) {
		String s = "Test%";
		boolean found=false;
	char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(!Character.isDigit(c[i]) && !Character.isWhitespace(c[i])&& !Character.isLetter(c[i])) {
				found =true;
				break;
			}
		}
		if(found) {
			System.out.println("does not contain special character");
		}else{
			System.out.println("contain special character");
		}
	}

	
}
