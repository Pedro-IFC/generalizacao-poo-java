package NaveEspacial;

public class NaveEspacialMain {

	public static void main(String[] args) {
		NaveEspacial nv = new NaveEspacial();
		nv.setVelocidadeMaxima(1000);
		System.out.println(nv);

		Apolo11 apolo = new Apolo11();
		apolo.setVelocidadeMaxima(1000);
		apolo.setTipoCombustivel("Sim");
		System.out.println(apolo);

		MillenniumFalcon millenium = new MillenniumFalcon();
		millenium.setVelocidadeMaxima(1000);
		millenium.setTipoCombustivel("Sim");
		millenium.setClasseHiperpropulsor(2000000);
		System.out.println(millenium);
	}

}
