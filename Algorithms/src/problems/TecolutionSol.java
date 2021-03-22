package problems;

import java.util.Scanner;

public class TecolutionSol {

public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	System.out.print("Enter Number of Compartments : ");
	int c = in.nextInt();
	System.out.print("Enter thesis Compartment Number : ");
	int r = in.nextInt();
	if(r>c)return;
	int[] vals = new int[c];
	System.out.print("Enter JetPack Values for Each Compartments : ");
	for(int i=0;i<c;i++) {
		 int t = in.nextInt();
		 if(t<0) {System.out.println("Negative Values Not Allowed");return;}
		 vals[i] = t;
		}
	//Exceptions To be handled (Negative Numbers , 0 capacity )
	
	int end = 0;
	int steps=0;
	r--;
	int ind=0;
	boolean run = true;
	System.out.print("Path is From Compartment : 1");
	while(true) {
		
			int j = end;
			
			
			
			j = j+vals[end];
			
			if(j>=r) {
				steps++;
				System.out.print("->"+(r+1));
				break;
			}
			
			ind = end;
			int max = 0;
			
			while(j>end) {
				if(max < end+vals[j]) {
					max = end+vals[j];
					ind = j;
					
				}
				if(max>=r) {
					//steps++;
					break;
				}
				j--;
			}
			
			
			
			end = ind;
			
			if(end<=r)System.out.print("->"+(end+1));
			else System.out.print("->"+(r+1));
			
			if(end>=r)break;
			steps++;
			
	}
	System.out.println("\n"+steps);
	
	}


}
