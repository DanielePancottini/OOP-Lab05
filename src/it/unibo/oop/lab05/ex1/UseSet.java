package it.unibo.oop.lab05.ex1;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {

	private final static int N_ELEMS = 20;
	
    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
       
    	final Set<String> coll = new TreeSet<>();
    	
    	for(int i = 1; i <= UseSet.N_ELEMS; i++) {
    		coll.add(Integer.toString(i));
    	}
    	
    	System.out.println(coll.toString());
    	
    	final Iterator<String> iterator = coll.iterator();
    	
    	while(iterator.hasNext()) {
    		String elem = iterator.next();
    		
    		if(Integer.valueOf(elem) % 3 == 0) {
    			iterator.remove();
    		}
    	}
    	
    	for(String elem : coll) {
    		if(Integer.valueOf(elem) % 3 == 0) {
    			System.out.println("false");
    			break;
    		}
    	}
    	
    }
}
