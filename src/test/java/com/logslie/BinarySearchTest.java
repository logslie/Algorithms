package com.logslie;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.logslie.algorithms.BinarySearch;
import com.logslie.algorithms.DFS;

public class BinarySearchTest {
	private static ArrayList<Integer> list = new ArrayList<Integer>();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(8);
		list.add(1);
		list.add(4);
	}

	@Test
	public final void testBinarySearch() {
		BinarySearch binarySearch = new BinarySearch(list);
		boolean result = binarySearch.binarySearch(8);
		//boolean result2 = bfs.search('H');

		assertTrue("Found character with BinarySearch", result);
	}

}
