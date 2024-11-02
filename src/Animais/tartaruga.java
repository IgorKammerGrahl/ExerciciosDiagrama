package Animais;

public class tartaruga extends Reptil{
	
	private String ambiente = "";
	private String cor = "";
	
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("tartaruga [ambiente=");
		builder.append(ambiente);
		builder.append(", cor=");
		builder.append(cor);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
