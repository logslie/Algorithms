/**
 * Copyright 2013 INdigital telecom
 * Creation Date: Aug 26, 2013
 */
package com.logslie.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author lauragarcia
 * 
 */
public class BinarySearch {
	private final static Logger logger = Logger.getLogger("DEVELOPMENT");

	private ArrayList<Integer> elementList;

	/**
	 * @param elementList
	 */
	public BinarySearch(ArrayList<Integer> elementList) {
		super();
		this.elementList = elementList;
	}

	/**
	 * Implements binary search
	 * 
	 * @param element
	 * @return True if the element is found
	 */
	public boolean binarySearch(int element) {
		boolean found = false;
		int middle = 0;
		int min_index = 0;
		int max_index = this.elementList.size() - 1;
		if (elementList != null && elementList.size() > 0) {
			Object[] intArray = this.elementList.toArray();
			logger.info("Original List:" + this.elementList);
			Arrays.sort(intArray);
			ArrayList sortList = new ArrayList<Integer>();
			List<Object> list = Arrays.asList(intArray);
			sortList.addAll(list);
			logger.info("Sorted List:" + sortList);
			while (!found && (min_index <= max_index)) {
				middle = (max_index + min_index) / 2;
				int value = (Integer) sortList.get(middle);
				if (value == element) {
					found = true;
				} else {
					if (element < value) {
						max_index = middle - 1;
					} else {
						min_index = middle + 1;
					}
				}
			}
			logger.info("Middle index:" + middle);
		}

		logger.info("Found:" + found);
		return found;
	}

}
