package Animais;

public class Cao extends Mamifero{

	private String raca = "";
	private double peso;

	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void darTossa() {
		if(this.isPelo()) {
			this.setPelo(false); 
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cao [raca=");
		builder.append(raca);
		builder.append(", peso=");
		builder.append(peso);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
