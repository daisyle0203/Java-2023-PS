/**
 * 
 */
package introtojavabasics;

/**
 * @author DaisyLe
 *
 */
public class Pizza {
	private String size;
	private int cheeseToppings;
	private int pepperoniToppings;
	private int hamToppings;

	// constructors that set off of the instance variable
	public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
		this.size = size;
		this.cheeseToppings = cheeseToppings;
		this.pepperoniToppings = pepperoniToppings;
		this.hamToppings = hamToppings;
	}

	// Getters and Setters
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getCheeseToppings() {
		return cheeseToppings;
	}

	public void setCheeseToppings(int cheeseToppings) {
		this.cheeseToppings = cheeseToppings;
	}

	public int getPepperoniToppings() {
		return pepperoniToppings;
	}

	public void setPepperoniToppings(int pepperoniToppings) {
		this.pepperoniToppings = pepperoniToppings;
	}

	public int getHamToppings() {
		return hamToppings;
	}

	public void setHamToppings(int hamToppings) {
		this.hamToppings = hamToppings;
	}

	// A public method named calcCost( ) thatnreturns a double that is the cost of
	// the pizza.
	// Pizza cost is determined by: Small: $10 + $2 per topping Medium: $12 + $2 per
	// topping Large: $14 + $2 per topping
	public double calcCost() {
		double cost = 0.0;

		switch (size) {
		case "small":
			cost = 10.0;
			break;
		case "medium":
			cost = 12.0;
			break;
		case "large":
			cost = 14.0;
			break;
		default:
			cost = 0.0;
			break;
		}

		cost += 2.0 * (cheeseToppings + pepperoniToppings + hamToppings);
		return cost;
	}

	// public method named getDescription( ) that returns a String containing the
	// pizza size, quantity of each topping.
	public String getDescription() {
		return "Size: " + size + ", Cheese Toppings: " + cheeseToppings + ", Pepperoni Toppings: " + pepperoniToppings
				+ ", Ham Toppings: " + hamToppings;
	}

	public static void main(String[] args) {
		// Create several pizzas
		Pizza pizza1 = new Pizza("large", 1, 1, 2);
		Pizza pizza2 = new Pizza("small", 2, 0, 1);
		Pizza pizza3 = new Pizza("medium", 0, 3, 0);

		// Output descriptions
		System.out.println("Pizza 1: " + pizza1.getDescription());
		System.out.println("Pizza 2: " + pizza2.getDescription());
		System.out.println("Pizza 3: " + pizza3.getDescription());

		// Calculate total cost
		double totalCost = pizza1.calcCost() + pizza2.calcCost() + pizza3.calcCost();
		System.out.println("Total cost: $" + totalCost);

		// Create PizzaOrder and add pizzas
		PizzaOrder order = new PizzaOrder();
		order.addPizza(pizza1);
		order.addPizza(pizza2);
		order.addPizza(pizza3);

		// Calculate total cost of the order
		double orderTotal = order.calcTotal();
		System.out.println("Order total: $" + orderTotal);
	}
}
