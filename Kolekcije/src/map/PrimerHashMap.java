package map;

import java.util.HashMap;
import java.util.Map;

public class PrimerHashMap {

	public static void main(String[] args) {

		Map<String, Integer> automobili = new HashMap<>();

		// dodavanje parova kljuc - vrednost 
		automobili.put("BMW", 5);
		automobili.put("Mercedes", 3);
		automobili.put("Audi", 4);
		automobili.put("Ford", 10);

		System.out.println("Ukupan broj proizvodjaca automobila: " + automobili.size());

		// prolazak kroz kolekciju koriscenjem keySet() metoda koji vraca sve kljuceve mape
		for (String key : automobili.keySet())
			System.out.println(key + " - " + automobili.get(key));
		System.out.println();

		String searchKey = "Audi";
		if (automobili.containsKey(searchKey))
			System.out.println("Pronadjeno ukupno " + automobili.get(searchKey) + " " + searchKey + " automobila!\n");

		// brisanje svih elemenata mape
		automobili.clear();

		System.out.println("Velicina kolekcije nakon brisanja: " + automobili.size());

	}

}
