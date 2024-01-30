/*
n = 4
1111
2222
3333
4444
*/
package jhansi;

import java.util.Scanner;

public class PrintingPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o = new Scanner(System.in);
		System.out.print("n = ");
		int n = o.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(i);
			System.out.println();
		}
		o.close();
	}

}
