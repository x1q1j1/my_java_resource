package leetcodeoj;

import org.junit.Test;

/**
 * Say you have an array for which the ith element is the price of a given stock
 * on day i.
 * 
 * Design an algorithm to find the maximum profit. You may complete as many
 * transactions as you like (ie, buy one and sell one share of the stock
 * multiple times). However, you may not engage in multiple transactions at the
 * same time (ie, you must sell the stock before you buy again).
 * 
 * @author Cris Zhao
 * 
 */
public class MaxProfit {

	public int maxProfit(int[] prices) {
		int result = 0;
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > prices[i - 1]) {
				result += prices[i] - prices[i - 1];
			}
		}
		return result;
	}

	@Test
	public void test() {
		int a[] = { 1, 2, 3, 4, 5, 3 };
		System.out.println(maxProfit(a));
	}
}
