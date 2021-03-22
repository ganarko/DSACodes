package Strings;

import java.util.Scanner;

public class increasinfNumbers {
	public static void printIncreasingNumber(int n) {
		/* Your class should be named Solution.
		 * Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
        helper(n,1,"");

	}
    public static void helper(int n,int start,String num){
        if(n==0){
            System.out.print(num+" ");
            return;
        }
        for(int i=start;i<=9;i++){
            String str = num + Integer.toString(i);
            helper(n-1,i+1,str);
        }

        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		printIncreasingNumber(a);

	}

}
