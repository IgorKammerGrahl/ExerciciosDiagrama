package PecasDeXadrez;

public class Peao extends Peca{
	
	public boolean mover(int linha, int coluna) {
		int direcao = isCor() ? 1 : -1;
		int linhaAtual = getLinha();
		int colunaAtual = getColuna();
		
		if(coluna == colunaAtual) {
			if(linha == linhaAtual + direcao) {
				setLinha(linha);
				setMovimentos(getMovimentos() + 1);
				return true;
			}
			
			if (getMovimentos() == 0 && linha == linhaAtual + 2 * direcao) {
				setLinha(linha);
				setMovimentos(getMovimentos() + 1);
				return true;
			}
		}
		
		if(Math.abs(coluna - colunaAtual) == 1 && linha == linhaAtual + direcao) {
			setLinha(linha);
			setColuna(coluna);
			setMovimentos(getMovimentos() + 1);
			return true;
		}
		return false;
		
	}

}
