package problems;

import java.util.Scanner;

public class KeyPadCode {
	
	public static void printKeypad(int input){
		// Write your code here
		char[][] array = {
    { '?' }, { '?' }, { 'A', 'B', 'C' }, { 'D', 'E', 'F' },
    { 'G', 'H', 'I' }, { 'J', 'K', 'L' }, { 'M', 'N', 'O' },
    { 'P', 'Q', 'R', 'S' }, { 'T', 'U', 'V' }, { 'W', 'X', 'Y', 'Z' }
		};
        String num = Integer.toString(input);

        // creates an combination Array
        // for 123 this is {{1},{ABC},{DEF}}
        char[][] combinationArr = new char[num.length()][];         
        for(int x = 0; x < num.length(); x++)
            combinationArr[x] = array[Character.getNumericValue(num.charAt(x))];

        // now print all permutations of combination Array
        // ics holds the actual index at each position
        int[] ics = new int[num.length()];
        boolean end = false;
    	//String s
        while(!end){ // while there are combinations left       
            // print the actual combination
            for(int i = 0; i < combinationArr.length; i++)
            {	String s = ""+combinationArr[i][ics[i]];
           		 s = s.toLowerCase();
                System.out.print(s);
            	
            }
            System.out.println();   
            // increases one index, starting with the last one.
            // If there is no char left it starts again at 0
            // and the index before will get increased.
            // If the first one could not get increased
            // we have all combinations.
            for(int i = ics.length - 1; i >= 0; i--){
                ics[i]++;
                if(ics[i] == combinationArr[i].length)
                    if(i == 0) end = true;
                    else ics[i] = 0;
                else break;
            }
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner s = new Scanner(System.in);
			int input = s.nextInt();
			printKeypad(input);
	}

}
