/**
 * Copyright 2013 logslie
 * Creation Date: Aug 23, 2013
 */
package com.logslie.algorithms;

import java.util.LinkedList;
import java.util.Queue;

import com.logslie.utils.NodeTree;

/**
 * @author lauragarcia
 * 
 */
public class BFS {

	private NodeTree tree;

	/**
	 * @param tree
	 */
	public BFS(NodeTree tree) {
		super();
		this.tree = tree;
	}

	/**
	 * Implements the BFS
	 * 
	 * @param element
	 * @return True if the element is found
	 */
	public Boolean search(char element) {

		Queue<NodeTree> nodeQueue = new LinkedList<NodeTree>();
		nodeQueue.add(this.tree);

		while (nodeQueue.size() > 0) {

			NodeTree actualElement = nodeQueue.poll();
			if (actualElement.getElement() == element) {
				return true;
			} else {
				nodeQueue.addAll(actualElement.getChildrenList());
			}

		}
		return false;
	}

}
