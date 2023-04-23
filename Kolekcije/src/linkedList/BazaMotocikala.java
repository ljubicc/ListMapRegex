package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BazaMotocikala {
	
	private List<Motocikl> motocikli;
	
	public BazaMotocikala() {
		motocikli = new LinkedList<Motocikl>();
	}
	
	public boolean daLiJeUBazi(Motocikl m) {
		return motocikli.contains(m);
	}
	
	public void unesiUBazu(Motocikl m) {
		if(daLiJeUBazi(m))
			System.out.println("Motocikl se vec nalazi u bazi!");
		else
			motocikli.add(m);
	}
	
	public void izbaciIzBaze(Motocikl m) {
		if(m != null)
			motocikli.remove(m);
		else
			System.out.println("Greska!");
	}
	
	// metoda izbaciIzBaze implementirana preko iteratora
	public void izbaciIzBazeI(Motocikl m) {
		if (!daLiJeUBazi(m)) {
			System.out.println("Motocikl se ne nalazi u bazi!");
		} else {
			Iterator<Motocikl> iter = motocikli.iterator();
			while (iter.hasNext()) {
				Motocikl motocikl = (Motocikl) iter.next();
				if (motocikl.equals(m)) {
					iter.remove();
					break;
				}
			}
		}
	}
	// vraca najvecu kubikazu u bazi motocikala
	public int maxKubikaza() {
		int max = 0;
		for(Motocikl motocikl : motocikli) {
			if(motocikl.getKubikaza() > max) {
				max = motocikl.getKubikaza();
			}
		}
		return max;
	}
	
	public double prosecnaKubikaza() {
		if(!motocikli.isEmpty()) {
			double suma = 0;
			for(Motocikl motocikl : motocikli) {
				suma += motocikl.getKubikaza();
			}
			return suma / motocikli.size();
		}
		else
			return 0;
	}
	
	public void ispisi() {
		for(Motocikl m : motocikli) {
			System.out.println(m);
		}
	}
}
