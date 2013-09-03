/**
 * Copyright 2013 INdigital telecom
 * Creation Date: Aug 26, 2013
 */
package com.logslie;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.logslie.algorithms.BFS;
import com.logslie.utils.NodeTree;

/**
 * @author lauragarcia
 *
 */
public class BFSTest {

	private static NodeTree rootTree;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		rootTree = new NodeTree('A');
		NodeTree nodelevel11 = new NodeTree('B');
		NodeTree nodelevel12 = new NodeTree('C');
		NodeTree nodelevel13 = new NodeTree('E');
		NodeTree nodelevel21 = new NodeTree('D');
		NodeTree nodelevel22 = new NodeTree('F');
		NodeTree nodelevel23 = new NodeTree('G');
		nodelevel11.addChild(nodelevel21);
		nodelevel11.addChild(nodelevel22);
		nodelevel12.addChild(nodelevel23);
		rootTree.addChild(nodelevel11);
		rootTree.addChild(nodelevel12);
		rootTree.addChild(nodelevel13);
	}

	/**
	 * Test method for {@link com.logslie.algorithms.DFS#search(char)}.
	 */
	@Test
	public final void testSearch() {
		BFS bfs = new BFS(rootTree);
		boolean result = bfs.search('G');
		//boolean result2 = bfs.search('H');

		assertTrue("Found character with BFS", result);

	}

}
