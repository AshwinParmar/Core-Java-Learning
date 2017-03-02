/**
 * 
 */
package com.ashwin;

/**
 * @author ashwin.d.parmar
 *
 */
public class UsingVariableNonPrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int age = 20;
		String first_name = "Ashwin";
		String last_name = "Parmar";
		
		String output = "";
		output = output.concat(first_name).concat(" ").concat(last_name).concat(" is ").concat(Integer.toString(age)).concat(" years old.");
		
		System.out.println(first_name + " " + last_name + " is " + age + " years old.");
		System.out.println(output);

	}

}
