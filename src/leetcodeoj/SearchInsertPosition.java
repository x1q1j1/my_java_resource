package leetcodeoj;

import org.junit.Test;

/**
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Here are few examples. [1,3,5,6], 5 → 2 [1,3,5,6], 2 → 1 [1,3,5,6], 7 → 4
 * [1,3,5,6], 0 → 0
 * 
 * 
 */
public class SearchInsertPosition {
	public int searchInsert(int[] A, int target) {
		int low = 0;
		int high = A.length - 1;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (A[middle] == target) {
				return middle;
			}
			if (A[middle] > target) {
				high = middle - 1;
			} else {
				low = middle + 1;

			}
		}
		return low;
	}

	@Test
	public void test() {
		int a[] = { 1, 3, 5, 6 };
		System.out.println(searchInsert(a, 1));
	}

}
