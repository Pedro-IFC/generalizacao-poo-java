package PessoaAlunoProfessor;

public class PessoaAlunoProfessorMain {
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setCodigo(1);
		p.setEndereco("Endereco");
		p.setNome("nome");
		System.out.println(p);
		
		Aluno a = new Aluno();
		a.setCodigo(1);
		a.setEndereco("Endereco");
		a.setNome("nome");
		a.setMatricula(22);
		System.out.println(a);
		
		Professor pr = new Professor();
		pr.setCodigo(1);
		pr.setEndereco("Endereco");
		pr.setNome("nome");
		pr.setDiciplina("Disciplina");
		System.out.println(pr);
	}
}
