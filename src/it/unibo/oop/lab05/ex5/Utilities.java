package it.unibo.oop.lab05.ex5;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 */
public final class Utilities {

    private Utilities() { }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the union of the input sets.
     */
    public static <X> Set<X> setUnion(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> resultSet = new HashSet<>(setA);
        resultSet.addAll(setB);
        return resultSet;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the intersection of the input sets.
     */
    public static <X> Set<X> setIntersection(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> resultSet = new HashSet<>();
        
        for(X elemA : setA) {
    		if(setB.contains(elemA)) {
    			resultSet.add(elemA);
    		}
        }
        
        return resultSet;
    }

    /**
     * @param setA
     *            a set
     * @param setB
     *            another set
     * @param <X>
     *            Returned collection type
     * @return a new set that is the symmetric difference of the input sets.
     */
    public static <X> Set<X> setSymmetricDifference(final Set<? extends X> setA, final Set<? extends X> setB) {
        Set<X> resultSet = new HashSet<>();
        
        resultSet = Utilities.setUnion(setA, setB);
        resultSet.removeAll(Utilities.setIntersection(setA, setB));
        
        return resultSet;
    }

    /**
     * @param coll
     *            the collection
     * @param <X>
     *            collection type
     * @return a random element from the collection
     *
     */
    public static <X> X getRandomElement(final Collection<X> coll) {
        
    	Random random = new Random();
    	Object[] arrayRepresentation = coll.toArray();
        
        return (X) arrayRepresentation[random.nextInt(arrayRepresentation.length)];
    }

    /**
     * @param first
     *            first collection
     * @param second
     *            second collection
     * @param <X>
     *            First collection type
     * @param <Y>
     *            Second collection type
     * @return a pair with two random elements
     */
    public static <X, Y> Pair<X, Y> getRandomPair(final Collection<X> first, final Collection<Y> second) {
        
    	Random random = new Random();
    	
    	X firstRandomElement = (X) first.toArray()[random.nextInt(first.size())];
    	Y secondRandomElement = (Y) second.toArray()[random.nextInt(second.size())];
    	
    	return new Pair<X, Y>(firstRandomElement, secondRandomElement);
    }
}
