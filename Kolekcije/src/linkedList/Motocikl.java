package linkedList;

public class Motocikl {

	private String marka;
	private String model;
	private int kubikaza;

	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
    // redefinisana metoda toString() klase Object
	public String toString() {
		return "Marka: " + marka + " Medel: " + model + " Kubikaza: " + kubikaza;
	}
	// redefinisana metoda equals klase Object koja vraca true 
	// ako su marka, model i kubikaza jednaki marki, modelu i kubikazi motocikla koji je unet kao parametar
	public boolean equals(Object o) {
		if (o instanceof Motocikl) {
			Motocikl m = (Motocikl) o;
			return marka.equals(m.getMarka()) && model.equals(m.getModel()) && kubikaza == m.getKubikaza();
		} else
			return false;
	}

}
