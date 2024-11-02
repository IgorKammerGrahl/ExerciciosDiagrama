package Animais;

public class Lagarto extends Reptil{
	
	private int chifres;
	private boolean venenoso;
	
	public int getChifres() {
		return chifres;
	}
	public void setChifres(int chifres) {
		this.chifres = chifres;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Lagarto [chifres=");
		builder.append(chifres);
		builder.append(", venenoso=");
		builder.append(venenoso);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
