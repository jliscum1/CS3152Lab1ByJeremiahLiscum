package edu.westga.cs3152.sets;

/**
 * Set - an unordered collection that implements a set of mutually
 * distinguishable elements. Any two elements el1 and el2 are mutually
 * distinguishable if el1.equals(el2) returns false. The collection does not
 * allow null elements. Equality of elements is determined by the equals
	 * method.
 * 
 * A Set provides an iterator. The iterator does not guarantee any order of the
 * traversed elements.
 * 
 * @author CS3152
 */
public interface Set<E> extends Iterable<E> {
	/**
	 * Returns the number of elements in this set.
	 * 
	 * @return the number of elements in this set
	 */
	int size();

	/**
	 * Returns true if this set contains no elements.
	 * 
	 * @return true if and only if this set contains no elements
	 */
	boolean isEmpty();

	/**
	 * Returns true if this set is equal to the specified set. 
	 * 
	 * @param set set that is checked for equality
	 * @return true if and only if each element in this set is contained in the
	 *         specified set and vice versa
	 * @throws NullPointerException if the specified set is null
	 */
	boolean equals(Set<E> set);

	/**
	 * Returns true if this set is a subset of the specified set. This set and the
	 * specified set may be equal.
	 * 
	 * @param set the set that is checked to contain this set
	 * @return true if and ony if this set is a subset of this set
	 * @throws NullPointerException if the specified set is null
	 */
	boolean isSubsetOf(Set<E> set);

	/**
	 * Returns true if this set is a proper subset of the specified set. 
	 * 
	 * @param set the set that is checked to contain this set
	 * @return true if and only if this set is a proper subset of the specified set
	 * @throws NullPointerException if the specified set is null
	 */
	boolean isProperSubsetOf(Set<E> set);

	/**
	 * Returns true if this set and the specified set are disjoint.
	 * 
	 * @param set the set that is check to be disjoint with this set
	 * @return true if and only if this set and the specified set are disjoint
	 * @throws NullPointerException if the specified set is null
	 */
	boolean isDisjoint(Set<E> set);

	/**
	 * Returns true if this set contains the specified element.
	 * 
	 * @param element the element whose presence is tested
	 * @return true if and only if this set contains the specified element 
	 * @throws IllegalArgumentException if the specified element is null
	 */
	boolean contains(E element);

	/**
	 * Adds the specified element to this set. If the specified element is contained
	 * in this set, this set remains unchanged.
	 * 
	 * @param element the element to be inserted
	 * @return true if and only if this set has been changed
	 * @throws IllegalArgumentException if the specified element is null
	 */
	boolean add(E element);

	/**
	 * Removes the specified element from this set. If the specified element is not
	 * contained in this set, the set remains unchanged.
	 * 
	 * @param element the element to be removed
	 * @return true if and only if this set has been changed
	 * @throws IllegalArgumentException if the specified element is null
	 */
	boolean remove(E element);

	/**
	 * Returns the union of this set and the specified set. This set and the
	 * specified set remain unchanged.
	 * 
	 * @param set the second operand of the union operation
	 * @return a set that contains exactly the elements of the union of this set and
	 *         the specified set
	 * @throws NullPointerException if the specified set is null
	 */
	Set<E> union(Set<E> set);

	/**
	 * Returns the intersection of this set and the specified set. This set and the
	 * specified set remain unchanged.
	 * 
	 * @param set the second operand of the intersection operation
	 * @return a set that contains exactly the elements of the intersection of this
	 *         set and the specified set
	 * @throws NullPointerException if the specified set is null
	 */
	Set<E> intersection(Set<E> set);

	/**
	 * Returns the difference of this set in respect to the specified set. This set
	 * and the specified set remain unchanged.
	 * 
	 * @param set the second operand of the difference operation
	 * @return a set that contains exactly the elements of set difference of this
	 *         set in respect to the specified set
	 * @throws NullPointerException if the specified set is null
	 */
	Set<E> difference(Set<E> set);
}
