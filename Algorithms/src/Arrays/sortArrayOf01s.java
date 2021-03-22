package Arrays;

import java.util.Scanner;

public class sortArrayOf01s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		String dump = input.nextLine();
		int[] arr = new int[n];
		int[] main = new int[3];
		for(int i=0;i<arr.length;i++){
		    arr[i] = input.nextInt();
		}
		//String dump1 = input.nextLine();
		for(int i=0;i<n;i++){
		    main[arr[i]]++;
		}
		//for(int i=0;i<3;i++){System.out.print(main[i]+" ");}
			//System.out.println();
			int k=0;
		for(int i=0;i<main.length;i++){
		    //System.out.print(arr[i]+" ");
		    
		    while(main[i]>0){
		        arr[k] = i;
		        k++;
		        main[i]--;
		    }
		}
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}

	}

}
