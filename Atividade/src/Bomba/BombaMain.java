package Bomba;

public class BombaMain {

	public static void main(String[] args) {
		Bomba b = new Bomba();
		b.setTotalLitros(10);
		b.setValorLitro(10);
		System.out.println(b);
		System.out.println(b.abastecerporLitro(9));
		System.out.println(b.abastecerporvalor(10));
		System.out.println(b);
	}

}
