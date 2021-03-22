package Graphs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
/* 
 * Weighted Graph
 * Minimum Spanning Tree vertices = n, edges = n-1
 * Kruskal
 * Prim
 * Dijkstra
 */
class edge implements Comparable<edge> {
	int source;
	int dist;
	int weight;
	public edge(int source,int dist,int weight) {
		this.source = source;
		this.dist  = dist;
		this.weight = weight;
	}
	@Override
	public int compareTo(edge o) {
		
		return (this.weight - o.weight);
	}
	
}
public class MSTAlgo {
	

	public static void main(String[] args) throws Exception {
		InputStreamReader r=new InputStreamReader(System.in);    
	    BufferedReader br=new BufferedReader(r);
	    
	    String[] st = br.readLine().split(" ");
    	int n = Integer.parseInt(st[0]);
    	int e = Integer.parseInt(st[1]);
    	int[][] graph = new int[n][n];
    	edge[] input = new edge[e];
	    for(int i=0;i<e;i++) {
	    	String[] str = br.readLine().split(" ");
	    	int x = Integer.parseInt(str[0]);
	    	int y = Integer.parseInt(str[1]);
	    	int wt = Integer.parseInt(str[2]);
	    	input[i] = new edge(x,y,wt);
	    	graph[x][y] = wt;
	    	graph[y][x] = wt;
	    	
	    }
	    System.out.println("Dijkstra algo for MST");
	    Dijakstra(graph,n);
	    System.out.println("Kruskals algo for MST");
	    kruskal(input,n);
	    System.out.println("Prims algo for MST");
	    prims(graph);
	    

	}
	private static void kruskal(edge[] in,int n) {
		Arrays.sort(in);
		edge[] output = new edge[n-1];
		//Parent
		int[] parent = new int[n];
		for(int i=0;i<n;i++)parent[i] =i;	
		int cnt = 0;
		int i = 0;
		while(cnt!=n-1) {
			edge curr = in[i];
			int sourceParent = findParent(curr.source,parent);
			int destParent = findParent(curr.dist,parent);
			if(sourceParent!=destParent) {
				output[cnt] = curr;
				cnt++;
				parent[sourceParent] = destParent;
			}
			i++;
		}
		for(i=0;i<output.length;i++) {
			
			edge e = output[i];
			if(e.source<e.dist)
			System.out.println(e.source+"->"+e.dist+" = "+e.weight);
			else
				System.out.println(e.dist+"->"+e.source+" = "+e.weight);
		}
		return;
	}
	private static int findParent(int v, int[] parent) {
		if(parent[v]==v)return v;
		return findParent(parent[v],parent);
	}
	private static void prims(int[][] graph) {
		int n = graph.length;
		boolean [] visited = new boolean[n];
		int[] weight = new int[n];
		int[] parent = new int[n];
		Arrays.fill(weight, Integer.MAX_VALUE);
		weight[0] =0;
		parent[0] =-1;
		for(int i=0;i<n;i++) {
			int ver = findMinVertex(weight,visited);
			visited[ver]=true;
			for(int j=0;j<n;j++) {
				if(graph[ver][j]!=0 && !visited[j]) {
					if(graph[ver][j] < weight[j]) {
						weight[j] = graph[ver][j];
						parent[j] = ver;
					}
				}
			}
		}
		for(int i=1;i<n;i++) {
			if(parent[i]<i)
			System.out.println(parent[i]+"->"+i+" = "+weight[i]);
			else 
			System.out.println(i+"->"+parent[i]+" = "+weight[i]);
		}
		
	}
	private static int findMinVertex(int[] weight, boolean[] visited) {
		int minVertex =-1;
		for(int i=0;i<weight.length;i++) {
			if(!visited[i] && (minVertex==-1 ||weight[i]<weight[minVertex]))
				minVertex = i;
		}
		return minVertex;
	}
	private static void Dijakstra(int[][] graph,int n) {
		int max= Integer.MAX_VALUE;
		boolean[] visited = new boolean[n];
		int [] dist = new int[n];
		Arrays.fill(dist,max);
		 dist[0] = 0;
		
		for(int i=0;i<n-1;i++) {
			
			int minVertex = findMinVertex(dist,visited);
			visited[minVertex] =true;
			
			for(int j=0;j<n;j++) {
				if(graph[minVertex][j]!=0 && !visited[j] && dist[minVertex]!=max ) {
					int newDist = dist[minVertex] + graph[minVertex][j];
					if(newDist<dist[j])dist[j]=newDist;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(i+" -> "+ dist[i]);
		}
	}
	
}
