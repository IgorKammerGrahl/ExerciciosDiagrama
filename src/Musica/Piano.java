package Musica;

public class Piano extends Cordas{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Piano [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
