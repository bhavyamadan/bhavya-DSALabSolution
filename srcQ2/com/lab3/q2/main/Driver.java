package com.lab3.q2.main;

import java.util.ArrayList;

public class Driver {
	
	static class Node
	{
	    Node left;
	    Node right;
	    int data;
	};
	
	//Create a new Node
	static Node newNode(int nodeData)
	{
	    Node temp = new Node();
	 
	    temp.data = nodeData;
	    temp.left = null;
	    temp.right = null;
	 
	    return temp;
	}
	
	public static ArrayList<Integer> longestPath(Node root)
	{
	    
	    if(root == null)
	    {
	        ArrayList<Integer> empty = new ArrayList<>();
	        return empty;
	    }
	    
	    // Recursive call on root.right
	    ArrayList<Integer> right = longestPath(root.right);
	    
	    // Recursive call on root.left
	    ArrayList<Integer> left = longestPath(root.left);
	     
	    
	    if(left.size() > right.size())
	        left.add(root.data);
	    else
	        right.add(root.data);
	     
	    if(left.size() > right.size())
	    	return left;
	    else 
	    	return right;
	    
	}
	
	public static void main(String[] args) {
		Node root = newNode(100);
	    root.left = newNode(20);
	    root.right = newNode(130);
	    root.left.left = newNode(10);
	    root.left.right = newNode(50);
	    root.right.left = newNode(110);
	    root.right.right = newNode(140);
	    root.left.left.left = newNode(5);
	     
	    ArrayList<Integer> output = longestPath(root);
	    int n = output.size();
	     
	    System.out.print(output.get(n - 1));
	    for(int i = n - 2; i >= 0; i--)
	    {
	        System.out.print(" -> " + output.get(i));
	    }
	}
}
