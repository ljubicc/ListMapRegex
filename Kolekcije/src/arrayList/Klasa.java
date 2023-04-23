package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Klasa {

	public static void main(String[] args) {

		ArrayList<String> listaImena = new ArrayList<>();

		// dodavanje u listu
		listaImena.add("Nikola");
		listaImena.add("Maja");
		listaImena.add("Dusica");
		listaImena.add("Marko");
		// dodavanje elementa preko indexa
		listaImena.add(2, "Jelena");

		// prikaz liste
		for (String s : listaImena) {
			System.out.print(s + " ");
		}

		// promena elementa
		listaImena.set(0, "Milica");

		System.out.println();
		// prikaz elemenata preko iteratora
		Iterator<String> iter = listaImena.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		// sortiranje liste
		Collections.sort(listaImena);
		System.out.println(listaImena);

		// brisanje elementa preko vrednosti indexa
		listaImena.remove(0);

		// prikaz elemenata preko for petlje
		for (int i = 0; i < listaImena.size(); i++) {
			System.out.print(listaImena.get(i) + " ");
		}

		System.out.println();
		// velicina liste
		System.out.println("Velicina liste: " + listaImena.size());
	}
}
