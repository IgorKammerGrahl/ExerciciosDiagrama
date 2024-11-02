package Musica;

public class Percussao extends InstrumentoMusical{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Percussao [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
