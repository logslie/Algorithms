/**
 * Copyright 2013 INdigital telecom
 * Creation Date: Aug 26, 2013
 */
package com.logslie.algorithms;

import java.util.Stack;

import com.logslie.utils.NodeTree;

/**
 * @author lauragarcia
 * 
 */
public class DFS {

	private NodeTree tree;

	/**
	 * @param tree
	 */
	public DFS(NodeTree tree) {
		super();
		this.tree = tree;
	}

	/**
	 * Implements the DFS
	 * 
	 * @param element
	 * @return True if the element is found
	 */
	public Boolean search(char element) {

		Stack<NodeTree> nodeStack = new Stack<NodeTree>();
		nodeStack.push(this.tree);

		while (nodeStack.size() > 0) {

			NodeTree actualElement = nodeStack.pop();
			if (actualElement.getElement() == element) {
				return true;
			} else {
				for (int i = actualElement.getChildrenList().size() - 1; i >= 0; i--) {
					nodeStack.push(actualElement.getChildrenList().get(i));
				}
			}

		}
		return false;
	}

}
