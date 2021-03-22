package MatrixProblems;

import java.util.ArrayList;

public class SpiralMatrixPath {
	boolean isValid(int row, int column, int sz, ArrayList<ArrayList<Integer>> soln) {
        if(row<0 || column<0 || row==sz || column == sz) 
            return false;
        if(soln.get(row).get(column) != 0) {
            return false;
        }    
        return true;
    }
    
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> soln = new ArrayList<ArrayList<Integer>>();
        if(A == 0) {
            return soln;
        }
        int[] dr = {0,1,0,-1};
        int[] dc = {1,0,-1,0};
        for(int i = 0; i<A; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j = 0; j<A; j++) {
                temp.add(0);
            }
            soln.add(temp);
        }
        
        int row = 0, column = 0, dir = 0;
        for(int i = 0; i<(A*A); i++) {
            soln.get(row).set(column, i+1);
            row += dr[dir];
            column += dc[dir]; 
            if(!isValid(row, column, A, soln)) {
                // Go back and change direction
                row -= dr[dir];
                column -= dc[dir];
                
                dir = (dir+1)%4;
                row += dr[dir];
                column += dc[dir];
            } 
        }
        return soln;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
