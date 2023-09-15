package Pessoa;

public class PessoaMain {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.setNome("A1");
		p.setEndereco("A2");
		System.out.println(p);
		
		PessoaFIsica pf = new PessoaFIsica();
		pf.setNome("B1");
		pf.setEndereco("B2");
		pf.setNome("B3");
		pf.setEndereco("B4");
		System.out.println(pf);
		

		PessoaJuridica pj = new PessoaJuridica();
		pj.setNome("C1");
		pj.setEndereco("C2");
		pj.setCnpj("C3");
		pj.setTipoEmpresa("C4");
		System.out.println(pj);
	}

}
