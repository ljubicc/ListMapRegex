package linkedList;

public class TestBazaMotocikala {

	public static void main(String[] args) {
		
		BazaMotocikala bm = new BazaMotocikala();
		
		Motocikl m1 = new Motocikl();
		m1.setMarka("Honda");
		m1.setModel("cbf 600");
		m1.setKubikaza(600);
		
		Motocikl m2 = new Motocikl();
		m2.setMarka("Kawasaki");
		m2.setModel("ZX9 R");
		m2.setKubikaza(900);
		
		bm.unesiUBazu(m1);
		bm.unesiUBazu(m2);
		
		bm.ispisi();
		
		Motocikl m3 = new Motocikl();
		m3.setMarka("Honda");
		m3.setModel("cbf 600");
		m3.setKubikaza(600);
		
		System.out.println("Da li postoji " + bm.daLiJeUBazi(m3));
		
		bm.izbaciIzBaze(m3);
		bm.ispisi();
		
				

	}

}
