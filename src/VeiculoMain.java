
public class VeiculoMain {

	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		caminhao c1 = new caminhao();
		Carro c2 = new Carro();
		Moto m = new Moto();
		
		v.setMotor(false);
		System.out.println(v);
		c1.setEixos(4);
		c1.setMotor(true);
		System.out.println(c1);
		c2.setPortas(4);
		m.setCilindradas(0);
	}

}
