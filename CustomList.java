package com.ds.finals;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;


public class CustomList<E> extends AbstractList<E> {
	private int size=0;
	private static int DEFAULTCAPACITY=10;
	private Object[] elements;

	public CustomList(){
		elements=new Object[DEFAULTCAPACITY];
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	
	public void add(int index, E element) {
		if(index<0 || index>size ) throw new IndexOutOfBoundsException();
		else {
			ensureCapacity();
			for(int i=size-1;i>=index;i--) {
				elements[i+1]=elements[i];
			}
			elements[index]=element;
			size++;
		}
		
	}

	private void ensureCapacity() {
		int newSize=elements.length*2;
		elements=Arrays.copyOf(elements, newSize);
	}


	@SuppressWarnings("unchecked")
	@Override
	public E get(int index) {

		if(index<0 || index>size ) throw new IndexOutOfBoundsException();
		else return (E)elements[index];
	}

	
}
