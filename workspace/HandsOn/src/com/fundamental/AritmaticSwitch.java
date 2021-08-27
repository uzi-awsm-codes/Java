/*3.Write a program to perform a specific arithmetic operation
 
Include a function named performArithmeticOperation that accepts 3 integer arguments and returns an integer that corresponds to the result. The first and second arguments correspond to the input numbers and the third argument corresponds to the choice of arithmetic operation.
 
If argument 3 =1, calculate the sum of input1 and input2
If argument 3 =2, calculate the difference of input1 and input2
If argument 3 =3, calculate the product of input1 and input2
If argument 3 =4, calculate the quotient of input1 divided by input 2 */

package com.fundamental;

import java.util.Scanner;

public class AritmaticSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, opcode, result;
		
		System.out.print("Enter First Number:");
	    a = sc.nextInt();

	    System.out.print("Enter Second Number:");
	    b = sc.nextInt();
	    
	    System.out.print("Enter Your Choice: 1 - sum, 2 - diff, 3 - Mul, 4 - Div: ");
	    opcode = sc.nextInt();
	    
	    switch (opcode)
	    {
	         case 1:
	            result = a + b;
	            System.out.format("%d + %d = %d\n", a, b, result);
	            break;

	         case 2:
	            result = a - b;
	            System.out.format("%d - %d = %d\n", a, b, result);
	            break;

	         case 3:
	            result = a * b;
	            System.out.format("%d * %d = %d\n", a, b, result);
	            break;

	         case 4:
	            result = a / b;
	            System.out.format("%d / %d = %d\n", a, b, result);
	            break;
	    }
	    
	    sc.close();
	    
	}

}
