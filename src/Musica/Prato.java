package Musica;

public class Prato extends Percussao{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prato [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
