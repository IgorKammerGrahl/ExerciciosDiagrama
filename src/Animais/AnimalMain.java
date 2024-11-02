package Animais;

public class AnimalMain {
	public static void main(String[] args) {
		Cao c = new Cao();
		Gato g = new Gato();
		
		c.darTossa();
		System.out.println(c);
		g.setCor("Verde");
		g.setGlandulasMamarias(3);
		System.out.println(g);
	}

}
