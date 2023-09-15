package Simples;

public class SimplesMain {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setAgencia(2);
		conta.setBanco("Banco");
		conta.setNumeroConta(2);
		conta.setSaldo(1000);
		conta.deposito(200);
		conta.saque(20);
		System.out.println(conta.toString());
		
		ContaSimples contaS = new ContaSimples();
		contaS.setAgencia(2);
		contaS.setBanco("Banco");
		contaS.setNumeroConta(2);
		contaS.setSaldo(1000);
		contaS.setSaldoPoupanca(15);
		contaS.deposito(200);
		contaS.saque(20);
		contaS.depositoPoupanca(200);
		contaS.saquePoupanca(210);
		System.out.println(contaS.toString());

		ContaEspecial contaE = new ContaEspecial();
		contaE.setAgencia(2);
		contaE.setBanco("Banco");
		contaE.setNumeroConta(2);
		contaE.setSaldo(1000);
		contaE.deposito(200);
		contaE.saque(20);
		contaE.setDiasSemJuros(2);
		contaE.setLimite(1000);
		System.out.println(contaE.toString());
		
	}

}
