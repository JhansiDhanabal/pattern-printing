/*
n=4
****
*  *
*  *
****
*/
package jhansi;

import java.util.Scanner;

public class PrintingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("n = ");
		int n = o.nextInt();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n ; j++) {
				if(i==0 || i==n-1 || j==0 || j==n-1)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		o.close();
	}

}
