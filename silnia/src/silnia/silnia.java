package silnia;

import java.util.Scanner;

public class silnia {
	 
		private static int Silnia(int i)
		{
		if (i < 1)
		return 1;
		else
		return i * Silnia(i - 1);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Podaj dla jakiej liczby obliczyc silnie.\n");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(n + "! = " +  Silnia(n));
	}

}
