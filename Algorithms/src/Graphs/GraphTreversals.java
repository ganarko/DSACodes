package Graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphTreversals {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    
	    int n = Integer.parseInt(br.readLine());
	    int e = Integer.parseInt(br.readLine());
	    int [][] graph =new int[n][n];
	    for(int i=0;i<e;i++) {
	    	String[] str = br.readLine().split(" ");
	    	int x = Integer.parseInt(str[0]);
	    	int y = Integer.parseInt(str[1]);
	    	graph[x][y] = 1;
	    	graph[y][x] = 1;
	    }
	    bfs(graph);
	    dfs(graph);
	    return;
	}
	public static void dfs(int[][] graph) {
		int n =graph.length;
		boolean visited[] = new boolean[n];
		System.out.print("DFS : ");
	
		for(int i=0;i<n;i++) {
			if(!visited[i])printDFSPath(graph,i,visited,n);
		}
		System.out.println("");
		
	}
	public static void printDFSPath(int[][]graph,int sv,boolean[] visited,int n) {
		System.out.print(sv+" ");
		visited[sv] =true;
		for(int i=0;i<n;i++) {
			if(graph[sv][i]==1 && !visited[i]) {
				printDFSPath(graph,i,visited,n);
			}
		}	
	}
	public static void bfs(int[][]graph) {
		int n = graph.length;
		boolean [] visited =new boolean[n];
		System.out.print("BFS : ");
		for(int i=0;i<n;i++)
			if(!visited[i])
				printBFSPath(graph,i,visited);
		
	    System.out.println("");
	    return;	
	}
	public static void printBFSPath(int[][]graph,int sv,boolean[] visited) {
		
		Queue<Integer> q =new LinkedList<>();
		q.add(sv);
		visited[sv] =true;
		int n = graph.length;
		while(!q.isEmpty()) {
			int front = q.poll();
			System.out.print(front+" ");
			for(int i=0;i<n;i++) {
				if(!visited[i] && graph[front][i]==1) {
					q.add(i);visited[i]=true;
					}
			}
		}
		
		
	}
	
}
