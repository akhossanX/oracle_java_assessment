
import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

	public static int calculateTotalPrice(int[] prices, int discount) {
		int total = 0;
		for (int p : prices) {
			total += p  - p * discount / 100;
		}
		return total;
	}
	
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int discount = in.nextInt();
		int n = in.nextInt();
		int[] prices = new int[n];
		for (int i = 0; i < n; i++) {
			prices[i] = in.nextInt();
		}
		System.out.println(Solution.calculateTotalPrice(prices, discount));
	}
}
