package Ambiente;

public class AmbienteMain {

	public static void main(String[] args) {
		Quarto q = new Quarto();
		Sala s = new Sala();
		
		q.setArea(15);
		q.setCapacidade(4);
		
		System.out.println(q);
		
		s.setArea(12);
		s.setTv(false);
		System.out.println(s);
	}

}
