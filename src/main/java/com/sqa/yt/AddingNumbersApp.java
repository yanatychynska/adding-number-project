/**
 * File Name: AddingNumbersApp.java<br>
 * Tychynska, Yana<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jan 16, 2017
 */
package com.sqa.yt;

import java.util.*;

import com.sqa.yt.helpers.*;

/**
 * AddingNumbersApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Tychynska, Yana
 * @version 1.0.0
 * @since 1.0
 */
public class AddingNumbersApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String appName = "Adding Numbers App";
		String userName = AppBasics.greetUserAndGetName(appName);
		addTwoNumbers();
		AppBasics.farewellUser(userName, appName);
		// greeting Auto-generated method stub
	}

	private static void addTwoNumbers() {
		int number1;
		int number2;
		int total;
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the first number to be added? ");
		number1 = Integer.parseInt(scanner.nextLine());
		System.out.println("What is the second number to be added to " + number1 + "?");
		number2 = Integer.parseInt(scanner.nextLine());
		total = number1 + number2;
		System.out.println("Your total from adding these two numbers is " + total);
	}
}
