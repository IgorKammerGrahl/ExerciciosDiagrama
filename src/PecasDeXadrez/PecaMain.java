package PecasDeXadrez;

public class PecaMain {

	public static void main(String[] args) {
		Peao p = new Peao();
		
		p.setColuna(0);
		p.setLinha(1);
		p.setCor(true);
		
		boolean primeiroMovimento = p.mover(2, 0);
		System.out.println("Moviemento para frente feito com: " + primeiroMovimento);
		
		p.setLinha(1);
		boolean movimentoImpossivel = p.mover(4, 0);
		System.out.println("Não se pode: " + movimentoImpossivel);
		
		p.setLinha(2);
		boolean diagonal = p.mover(3, 1);
		System.out.println(diagonal);
		
		p.setLinha(2);
		p.setColuna(0);
		boolean diagonalInvalido = p.mover(3, 2);
		System.out.println(diagonalInvalido);
		
		System.out.println(p);
		
		System.out.println("======================================================================");
		
		Torre t = new Torre();
		
		t.setColuna(0);
		t.setLinha(0);
		t.setCor(false);
		
		boolean movimento1 = t.mover(3, 0);
		System.out.println("Espera-se true: " + movimento1);
		
		t.setLinha(3);
		
		boolean movimento2 = t.mover(3, 5);
		System.out.println("Espera-se true: " + movimento2);
		
		boolean movimentoErro = t.mover(4, 6);
		System.out.println(movimentoErro);
		
		boolean movimentoRetorno = t.mover(0, 5);
        System.out.println(movimentoRetorno);

        boolean movimentoInvalido2 = t.mover(1, 3);
        System.out.println(movimentoInvalido2);
        
        System.out.println(t);
	}

}
