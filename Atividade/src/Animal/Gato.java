package Animal;

public class Gato extends Mamifero{
	private boolean habitosNoturnos;

	public boolean isHabitosNoturnos() {
		return habitosNoturnos;
	}

	public void setHabitosNoturnos(boolean habitosNoturnos) {
		this.habitosNoturnos = habitosNoturnos;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Gato [habitosNoturnos=");
		builder.append(habitosNoturnos);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
