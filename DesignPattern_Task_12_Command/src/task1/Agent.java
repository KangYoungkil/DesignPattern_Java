package task1;

import java.util.LinkedList;
import java.util.Queue;

public class Agent {
	private Queue<Order> ordersQueue = new LinkedList<Order>();

	public Agent() {
	}

	void placeOrder(Order order) {
		ordersQueue.add(order);
		ordersQueue.remove(0);
		order.execute();
	}
}