package problems;
import java.util.Arrays;
import java.util.List;
public class keypadSubStrings {
// Top-down Recursive function to find all possible combinations of words formed
		// from mobile keypad
		public static void findCombinations(List<List<Character>> keypad,
											int[] input, String res, int index)
		{
			// if we have processed every digit of key, print result
			if (index == -1)
			{
				System.out.print(res + " ");
				return;
			}

			// stores current digit
			int digit = input[index];

			// one by one replace the digit with each character in the corresponding
			// list and recur for next digit
			for (char c: keypad.get(digit)) {
				findCombinations(keypad, input, c + res, index - 1);
			}
		}

		public static void main(String[] args)
		{
			List<List<Character>> keypad = Arrays.asList(
					// 0 and 1 digit don't have any characters associated
					Arrays.asList(),
					Arrays.asList(),
					Arrays.asList( 'A', 'B', 'C' ),
					Arrays.asList( 'D', 'E', 'F' ),
					Arrays.asList( 'G', 'H', 'I' ),
					Arrays.asList( 'J', 'K', 'L' ),
					Arrays.asList( 'M', 'N', 'O' ),
					Arrays.asList( 'P', 'Q', 'R', 'S'),
					Arrays.asList( 'T', 'U', 'V' ),
					Arrays.asList( 'W', 'X', 'Y', 'Z')
			);

			// input number in the form of an array (number can't start from 0 or 1)
			int[] input = { 2, 3, 4 };

			// find all combinations
			findCombinations(keypad, input, "", input.length - 1);
		}
	

}
