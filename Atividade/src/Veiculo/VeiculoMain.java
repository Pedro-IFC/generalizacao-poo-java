package Veiculo;

public class VeiculoMain {

	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		v.setMotor(true);
		System.out.println(v.isMotor());
		
		System.out.println("=====================");

		Caminhao caminhao = new Caminhao();
		caminhao.setMotor(false);
		caminhao.setEixos(3);
		System.out.println(caminhao.isMotor());
		System.out.println(caminhao.getEixos());
		
		System.out.println("=====================");

		Carro carro = new Carro();
		carro.setMotor(false);
		carro.setPortas(2);
		System.out.println(carro.isMotor());
		System.out.println(carro.getPortas());
		
		System.out.println("=====================");

		Moto moto = new Moto();
		moto.setMotor(false);
		moto.setCilindradas(2);
		System.out.println(moto.isMotor());
		System.out.println(moto.getCilindradas());
	}

}
