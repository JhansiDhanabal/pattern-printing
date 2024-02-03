/*
row and col = 4 6
******
 ******
  ******
   ******

*/
package jhansi;

import java.util.Scanner;

public class PrintingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("row and col = ");
		int row = o.nextInt();
		int col = o.nextInt();
		for(int i=0; i<row; i++) {
			for(int j=0;j<i;j++)
				System.out.print(" ");
			for(int j=0;j<col;j++) 
				System.out.print("*");
			
			System.out.println();
		}
		o.close();
	}

}
