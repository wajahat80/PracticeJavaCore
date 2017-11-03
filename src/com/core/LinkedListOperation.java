package com.core;

public class LinkedListOperation {

	public LinkedListOperation() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]){
		LinkedListOperation n = new LinkedListOperation();
	}
	
	
	public class Node {
		Node nextNode=null;
		int nodeValue = 0;
		
		public Node(){
			
		}
		
		Node getNextNode(){
			return this.nextNode;
		}
		
		void setNextNode(Node n){
			this.nextNode = n;
		}

		public int getNodeValue() {
			return nodeValue;
		}

		public void setNodeValue(int nodeValue) {
			this.nodeValue = nodeValue;
		}
		
	}

}
