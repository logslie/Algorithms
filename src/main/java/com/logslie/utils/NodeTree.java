/**
 * Copyright 2013 logslie
 * Creation Date: Aug 23, 2013
 */
package com.logslie.utils;

import java.util.ArrayList;

/**
 * @author lauragarcia
 * 
 */
public class NodeTree {

	private char element;
	private ArrayList<NodeTree> childrenList;

	/**
	 * @param element
	 * @param childrenNode
	 */
	public NodeTree(char element) {
		super();
		this.element = element;
		this.childrenList = new ArrayList<NodeTree>();
	}

	/**
	 * @return the element
	 */
	public char getElement() {
		return element;
	}

	/**
	 * @param element
	 *            the element to set
	 */
	public void setElement(char element) {
		this.element = element;
	}

	/**
	 * @param childrenNode
	 *            the childrenNode to set
	 */
	public void setChildrenList(ArrayList<NodeTree> childrenList) {
		this.childrenList = childrenList;
	}

	/**
	 * @return the childrenNode
	 */
	public ArrayList<NodeTree> getChildrenList() {
		return childrenList;
	}

	/**
	 * Add a new child to the node
	 * 
	 * @param element
	 */
	public void addChild(NodeTree element) {
		this.childrenList.add(element);
	}

	
	/**
	 * Returns true if the node is a leaf node
	 * 
	 * @return
	 */
	public boolean isLeafNode() {
		return this.childrenList.size() == 0;
	}

}
