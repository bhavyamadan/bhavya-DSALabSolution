package com.lab3.q1.main;

import java.util.Scanner;

import com.lab3.q1.service.BalancingBrackets;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BalancingBrackets bb = new BalancingBrackets();
		System.out.print("Enter the Bracket sequence : ");
		String bracketExpression = sc.nextLine();
		//System.out.println( (bb.isBalanced(bracketExpression)) ? "YES" : "NO" );
		boolean result = bb.isBalanced(bracketExpression);
		if(result)
			System.out.println("The entered String has Balanced Brackets");
		else
			System.out.println("The entered Strings do not contain Balanced Brackets");
		
		sc.close();
	}
}
