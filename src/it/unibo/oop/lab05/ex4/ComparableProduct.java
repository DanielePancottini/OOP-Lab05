package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {

	public ComparableProduct(String name, double quantity) {
		super(name, quantity);
	}

	@Override
	public int compareTo(Product o) {
		return this.getName().compareTo(o.getName());
	}

	@Override
	public String toString() {
		return "ComparableProduct [getName()=" + getName() + ", getQuantity()=" + getQuantity() + "]";
	}

}
