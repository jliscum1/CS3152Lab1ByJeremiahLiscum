/**
 * 
 */
package edu.westga.cs3152.sets;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Jeremiah Liscum
 *
 */
public class Collection implements Set<Object> {
	private ArrayList <Object> objects;
	
	public Collection() {
		this.objects = new ArrayList<Object>();
	}

	@Override
	public Iterator iterator() {
		return objects.iterator();
	}

	@Override
	public int size() {
		return objects.size();
	}

	@Override
	public boolean isEmpty() {
		return objects.isEmpty();
	}

	@Override
	public boolean equals(Set set) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSubsetOf(Set set) {
		
		return false;
	}

	@Override
	public boolean isProperSubsetOf(Set set) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isDisjoint(Set set) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Object element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean add(Object element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Object element) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set union(Set set) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set intersection(Set set) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set difference(Set set) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
