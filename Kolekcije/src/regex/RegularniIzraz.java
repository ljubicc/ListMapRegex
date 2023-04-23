package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularniIzraz {

	public static void main(String[] args) {

		// pojavljivanja svih brojeva u tekstu.
		String str = getData();
		prikaziSamoBrojeve(str);
	}
	
	// Pattern klasa sluzi za definisanje sablona za pretragu
	// Matcher klasa koristi se za pretrazivanje stringova pomocu regularnog izraza
	static void prikaziSamoBrojeve(String data) {
		// [0-9]+ -> 1 ili vise cifri
		// (...)? -> 0 ili 1 pojavljivanja sablona unutar zagrade
		// [.] -> pojavljivanja karaktera .
		// [0-9]* -> 0 ili vise cifri
		Pattern pattern = Pattern.compile("[0-9]+([.][0-9]*)?");
		Matcher matcher = pattern.matcher(data);
		while (matcher.find())
			System.out.println(matcher.group());
	}

	static String getData() {
		return " Lorem ipsum 1 dolor sit amet, consectetur 2 adipiscing elit. "
				+ "Nunc malesuada turpis tellus, vitae 3.14159265359 maximus purus auctor eu. "
				+ "Sed tempor dolor orci, et hendrerit 4.14 eros porttitor vel. "
				+ "Proin viverra turpis vitae 5.111235123eros vehicula imperdiet sit amet id erat. "
				+ "Fusce sed rutrum elit. Cras 6.11 dui ligula, dictum ac commodo eget, "
				+ "scelerisque et lectus. Vestibulum 7.1 porta molestie fermentum. "
				+ "Class aptent taciti sociosqu ad litora torquent per conubia nostra, "
				+ "per inceptos himenaeos. Praesent et enim sem. Proin condimentum viverra "
				+ "ligula eget interdum. Donec eget 8 tortor porta, eleifend mauris nec, laoreet erat. "
				+ "Nunc ultrices tortor vitae malesuada 9 iaculis. ";
	}

}
