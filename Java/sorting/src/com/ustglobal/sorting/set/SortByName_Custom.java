package com.ustglobal.sorting.set;

import java.util.Comparator;

public class SortByName_Custom implements Comparator<Customer> {
	
	@Override
	public int compare(Customer o1, Customer o2) {
		return o1.name.compareTo(o2.name);
	}

}
