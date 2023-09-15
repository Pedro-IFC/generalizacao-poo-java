package Ambiente;

public class AmbienteMain {

	public static void main(String[] args) {
		Ambiente a = new Ambiente();
		a.setArea(24);
		System.out.println(a);
		
		Quarto q = new Quarto();
		q.setArea(24);
		q.setCapacidade(12);
		System.out.println(q);
		
		Sala s = new Sala();
		s.setArea(24);
		s.setTv(true);
		System.out.println(s);
		
		Banheiro b = new Banheiro();
		b.setArea(24);
		b.setBanheira(true);
		System.out.println(b);
		
		Cozinha c = new Cozinha();
		c.setArea(24);
		c.setMicroondas(false);
		System.out.println(c);
		
	}

}
