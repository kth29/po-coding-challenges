package po_weekly_challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReorderDigits {
	/**
	 * a) Create a function that reorders the digits of each numerical element in an
	 * array based on ascending (asc) or descending (desc) order.
	 * 
	 * Examples: reorderDigits([515, 341, 98, 44, 211], "asc") ➞ [155, 134, 89, 44,
	 * 112]
	 * 
	 * reorderDigits([515, 341, 98, 44, 211], "desc") ➞ [551, 431, 98, 44, 211]
	 * 
	 * reorderDigits([63251, 78221], "asc") ➞ [12356, 12278]
	 * 
	 * reorderDigits([63251, 78221], "desc") ➞ [65321, 87221]
	 * 
	 * reorderDigits([1, 2, 3, 4], "asc") ➞ [1, 2, 3, 4]
	 * 
	 * reorderDigits([1, 2, 3, 4], "desc") ➞ [1, 2, 3, 4]
	 * 
	 * Notes: Single-digit numbers should be ordered the same regardless of
	 * direction. Numbers in the array should be kept the same order.
	 * 
	 */

	public static List<Integer> reorderDigits(int[] arr) {
		// create ArrayList for reordered digits
		List<Integer> reordered = new ArrayList<>();
		// loop thru given int[]
		for (int a = 0; a < arr.length; a++) {
			// for each value
			int num = arr[a];
			// convert to a String
			String value = String.valueOf(num);
			// convert String to a char[] of single digits
			char[] digits = value.toCharArray();
			// sort char[] in asc order
			Arrays.sort(digits);
			// convert sorted char[] back to int
			int sortedNum = Integer.parseInt(new String(digits));
			//add sortedNum to ArrayList
			reordered.add(sortedNum);

		}
		//return reordered ArrayList
		return reordered;
	}

}
