package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public class CustomStringComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return Double.compare(Double.valueOf(o1), Double.valueOf(o2));
	}

}
