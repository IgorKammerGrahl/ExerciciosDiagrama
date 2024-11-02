package Musica;

public class Saxofone extends Madeira{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Saxofone [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
