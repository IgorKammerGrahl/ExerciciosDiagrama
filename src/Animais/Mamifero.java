package Animais;

public class Mamifero extends Animal{
	
	private boolean pelo = true;
	private int glandulasMamarias;
	
	public boolean isPelo() {
		return pelo;
	}
	public void setPelo(boolean pelo) {
		this.pelo = pelo;
	}
	public int getGlandulasMamarias() {
		return glandulasMamarias;
	}
	public void setGlandulasMamarias(int glandulasMamarias) {
		this.glandulasMamarias = glandulasMamarias;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mamifero [pelo=");
		builder.append(pelo);
		builder.append(", glandulasMamarias=");
		builder.append(glandulasMamarias);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
