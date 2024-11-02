package Musica;

public class Tambor extends Percussao{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Tambor [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
