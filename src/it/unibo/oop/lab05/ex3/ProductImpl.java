package it.unibo.oop.lab05.ex3;

import java.util.Objects;

public class ProductImpl implements Product {

	private final String name;
	private double quantity;
	
	public ProductImpl(final String name, final double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	/*
	 * Getters & Setters
	 * */
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public double getQuantity() {
		return this.quantity;
	}
	
	public void setQuantity(final double quantity) {
		this.quantity = quantity;
	}

	/*
	 * Hash and Equals
	 * */
	
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductImpl other = (ProductImpl) obj;
		return Objects.equals(name, other.name);
	}	

}
