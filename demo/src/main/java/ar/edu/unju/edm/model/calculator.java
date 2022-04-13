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
	public double resolverpot() {
		return Math.pow(numbera,numberb);
		}
		public double solvesqroot() { //borrar

		return Math.sqrt(numbera);
		}
		public float solvesqroot3() { // numbera es el radicando y numberb el indice

			// para resolver se eleva el radicando a la potencia del exponente del radicando sobre el indice
			double base,exp;
			base = numbera;
			exp = numberb;
			
			return (float) Math.pow(base, 1 / exp);
		}
		public double resolvesqroot2() { // borrar

		return Math.sqrt(numberb);
		}
}
