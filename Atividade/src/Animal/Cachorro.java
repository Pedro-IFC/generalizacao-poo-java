package Animal;

public class Cachorro extends Mamifero {
	private boolean habitosDiurnos;

	public boolean isHabitosDiurnos() {
		return habitosDiurnos;
	}

	public void setHabitosDiurnos(boolean habitosDiurnos) {
		this.habitosDiurnos = habitosDiurnos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cachorro [habitosDiurnos=");
		builder.append(habitosDiurnos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
