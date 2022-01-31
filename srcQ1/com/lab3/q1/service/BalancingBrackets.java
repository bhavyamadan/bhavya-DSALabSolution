package com.lab3.q1.service;

import java.util.Stack;

public class BalancingBrackets {
	public boolean isBalanced(String expression) {
		Stack<Character> bracketStack = new Stack<>();
		for(int i = 0; i < expression.length(); i++) {
			char bracket = expression.charAt(i);
			switch(bracket) {
			case ')':
				if (bracketStack.isEmpty() || bracketStack.peek() != '(') 
					return false;
				else bracketStack.pop();
				break;
			case '}':
				if (bracketStack.isEmpty() || bracketStack.peek() != '{') 
					return false;
				else bracketStack.pop();
				break;
			case ']':
				if (bracketStack.isEmpty() || bracketStack.peek() != '[') 
					return false;
				else bracketStack.pop();
				break;
			default:
				bracketStack.push(bracket);
			}
		}
		
		return bracketStack.isEmpty();
	}
}
