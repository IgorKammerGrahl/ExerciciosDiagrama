package BombaDeCombustivel;

public class Bomba {

	private double totalLitros;
	private float valorLitro;

	public double getTotalLitros() {
		return totalLitros;
	}
	public void setTotalLitros(double totalLitros) {
		this.totalLitros = totalLitros;
	}
	public float getValorLitro() {
		return valorLitro;
	}
	public void setValorLitro(float valorLitro) {
		this.valorLitro = valorLitro;
	}

	public boolean abastecerPorLitro(int litros) {
		if (litros <= 0) {
			return false;
		}else {
			if(totalLitros > 0) {
				if(litros > totalLitros) {
					System.out.println("Não temos isso tudo?");
					return false;
				}
				totalLitros = totalLitros - litros;
				return true;
			}else{
				System.out.println("Tanque está vazio");
				return false;
			}
		}
	}
	
	public boolean abastecerPorValor(double valor) {
		double valorEmLitro = 0;
		if (valor <= 0) {
			return false;
		}else{
			if(totalLitros > 0) {
				valorEmLitro = valor/valorLitro;
				if(valorEmLitro > totalLitros) {
					System.out.println("Quer o posto pra ti?");
					return false;
				}
				totalLitros = totalLitros - valorEmLitro;
				return true;
			}else{
				System.out.println("Tanque está vazio");
				return false;
			}
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bomba [totalLitros=");
		builder.append(totalLitros);
		builder.append(", valorLitro=");
		builder.append(valorLitro);
		builder.append("]");
		return builder.toString();
	}

}
