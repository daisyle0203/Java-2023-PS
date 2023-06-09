package introtojavabasics2;

public class MathBox<E extends Number> {
	private E data;

	public MathBox(E data) {
		this.data = data;
	}

	public double sqrt() {
		return Math.sqrt(this.data.doubleValue());
	}
}
