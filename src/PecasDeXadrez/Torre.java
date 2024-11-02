package PecasDeXadrez;

public class Torre extends Peca{
	
	public boolean mover(int linha, int coluna) {
		int linhaAtual = getLinha();
		int colunaAtual = getColuna();
		
		if (linha == linhaAtual || coluna == colunaAtual) {
			setLinha(linha);
			setColuna(coluna);
			setMovimentos(getMovimentos() + 1);
			return true;
		}
		
		return false;
	}

}
