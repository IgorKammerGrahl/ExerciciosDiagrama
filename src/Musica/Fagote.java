package Musica;

public class Fagote extends Madeira{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fagote [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
