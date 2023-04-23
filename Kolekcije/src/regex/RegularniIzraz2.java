package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularniIzraz2 {

	public static void main(String[] args) {
		
		//provera pravilnog unosa Email adrese
		System.out.println(validacijaEmailAdrese("slobodan.ljubic18gmail.com"));
		
	}
	
	public static boolean validacijaEmailAdrese(String str) {
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher = pattern.matcher(str);
		return matcher.find();
	}

}
