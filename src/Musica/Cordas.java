package Musica;

public class Cordas extends InstrumentoMusical{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cordas [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
