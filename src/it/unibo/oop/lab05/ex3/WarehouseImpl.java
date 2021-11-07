package it.unibo.oop.lab05.ex3;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WarehouseImpl implements Warehouse {
	
	private final Set<Product> products;
	
	public WarehouseImpl() {
		this.products = new LinkedHashSet<>();
	}

	@Override
	public void addProduct(Product p) {
		this.products.add(p);
	}

	@Override
	public Set<String> allNames() {
		
		final Set<String> resultSet = new TreeSet<>();
		
		for(Product product : this.products) {
			resultSet.add(product.getName());
		}
		
		return resultSet;
	}

	@Override
	public Set<Product> allProducts() {
		return Collections.unmodifiableSet(this.products);
	}

	@Override
	public boolean containsProduct(Product p) {
		return this.products.contains(p);
	}

	@Override
	public double getQuantity(String name) {
		
		for(Product p : this.products) {
			if(p.getName().equals(name)) {
				return p.getQuantity();
			}
		}
		
		return -1;
	}

}
