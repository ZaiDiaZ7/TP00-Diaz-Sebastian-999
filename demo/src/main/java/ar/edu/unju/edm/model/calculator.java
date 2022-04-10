package ar.edu.unju.edm.model;

public class calculator {
	private int numbera;
	 private int numberb;
	 
	 public calculator() {
	    // TODO Auto-generated constructor stub
	}

	public int getNumbera() {
	    return numbera;
	}

	public void setNumbera(int numbera) {
	    this.numbera = numbera;
	}

	public int getNumberb() {
	    return numberb;
	}

	public void setNumberb(int numberb) {
	    this.numberb = numberb;
	}
	 

	public int resolveplus() {
	    return numbera + numberb;

	}

	public int resolveresta() {
	    return numbera - numberb;

	}
	public int resolverdivision() {
	    return numbera / numberb;

	}
	public int resolvermultiplicacion() {
	    return numbera * numberb;

	}
}
