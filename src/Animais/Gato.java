package Animais;

public class Gato extends Mamifero{
	
	private String cor = "";

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void darTossa() {
		if(this.isPelo()) {
			this.setPelo(false); 
		}
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [cor=");
		builder.append(cor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
