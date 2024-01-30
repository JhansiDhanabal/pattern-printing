/*
n = 4
*
**
***
****
***
**
*

*/
package jhansi;

import java.util.Scanner;

public class PrintingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("n = ");
		int n = o.nextInt();
		for(int i=0; i<2*n-1; i++) {
			if(i>=n) {
				for(int j=i;j<n*2-1;j++)
					System.out.print("*");
			}
			else {
				for(int j=0;j<=i%n;j++)
				System.out.print("*");
			}
			System.out.println();
		}
		o.close();
	}

}
