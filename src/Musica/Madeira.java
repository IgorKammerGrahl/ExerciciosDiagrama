package Musica;

public class Madeira extends InstrumentoMusical{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Madeira [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
