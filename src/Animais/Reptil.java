package Animais;

public class Reptil extends Animal{
	
	private String pele = "Escamas";
	private boolean oviparos;
	
	public String getPele() {
		return pele;
	}

	public boolean isOviparos() {
		return oviparos;
	}
	public void setOviparos(boolean oviparos) {
		this.oviparos = oviparos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Reptil [pele=");
		builder.append(pele);
		builder.append(", oviparos=");
		builder.append(oviparos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
