package AlunosProfessor;

public class PessoaMain {

	public static void main(String[] args) {
		Aluno a = new Aluno();
		
		a.setCodigo(1234);
		a.setEndereco("Boa Vista");
		a.setMatricula(82479);
		a.setNome("Igor");
		
		System.out.println(a);
		
		Professor p = new Professor();
		
		p.setCodigo(2131241);
		p.setDisciplina("Informática");
		p.setEndereco("Bela Vista");
		p.setNome("Robert");
		
		System.out.println(p);
		

	}

}
