/**
 * 
 */
package introtojavabasics;

/**
 * @author DaisyLe
 *
 */
public class PizzaOrder {

	private Pizza[] pizzas;
	private int numPizzas;

	public PizzaOrder() {
		pizzas = new Pizza[3];
		numPizzas = 0;
	}

	public void addPizza(Pizza pizza) {
		if (numPizzas < 3) {
			pizzas[numPizzas] = pizza;
			numPizzas++;
		} else {
			System.out.println("Maximum number of pizzas reached.");
		}
	}

	public double calcTotal() {
		double total = 0.0;
		for (int i = 0; i < numPizzas; i++) {
			total += pizzas[i].calcCost();
		}
		return total;

	}

}
