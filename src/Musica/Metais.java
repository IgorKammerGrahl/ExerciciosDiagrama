package Musica;

public class Metais extends InstrumentoMusical{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Metais [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
