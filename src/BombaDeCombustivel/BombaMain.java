package BombaDeCombustivel;

public class BombaMain {

	public static void main(String[] args) {
		Bomba b = new Bomba();
		BombaGasolina bg = new BombaGasolina();
		
		b.setTotalLitros(320);
		b.setValorLitro(12);
		b.abastecerPorValor(50.50);
		System.out.println(b);
		
		bg.setTotalLitros(20);
		bg.setValorLitro(16);
		bg.abastecerPorLitro(3);
		bg.abastecerPorValor(204.20);
		System.out.println(bg);
		
		
		
	}

}
