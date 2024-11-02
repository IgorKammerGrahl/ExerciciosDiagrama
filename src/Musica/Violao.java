package Musica;

public class Violao extends Cordas{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Violao [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
