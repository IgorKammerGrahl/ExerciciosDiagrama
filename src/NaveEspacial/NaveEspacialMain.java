package NaveEspacial;

public class NaveEspacialMain {
	public static void main(String[] args) {
		MilleniumFalcon m = new MilleniumFalcon();
		
		m.setClasseHiperpropulsor(2);
		m.setTipoCombustivel("Rhydonium");
		m.setVelocidadeMaxima(149896229.0);
		
		System.out.println(m);
	}
	

}
