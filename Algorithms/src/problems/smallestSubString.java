package problems;

import java.util.HashMap;
import java.util.Scanner;

public class smallestSubString {
	public static String smallSubString(String large,String small) {
		 int s = small.length();
	        int L = large.length();
	        char first = small.charAt(0);
	        char last = small.charAt(s-1);
	        
	        if(s==0 || L==0)return "";
	        
	        HashMap<Character,Integer> map = new HashMap<>();
	        
	        for(int i=0;i<s;i++){
	            
	            int count = map.getOrDefault(small.charAt(i),0);
	            map.put(small.charAt(i),count+1);
	            
	        }
	        int req = map.size();
	        
	        int l=0,r=0;
	        int form =0;
	         HashMap<Character,Integer> mapL = new HashMap<>();
	        
	        int[] ans = {-1,0,1};
	        
	        while(r<L){
	            char c = large.charAt(r);
	            int count = mapL.getOrDefault(c,0);
	            mapL.put(c,count+1);
	            
	            if(map.containsKey(c)&& mapL.get(c) == map.get(c) ){
	                form++;
	            }
	            
	            while(l<=r && form==req){
	                c = large.charAt(l);
	                if(ans[0]==-1 || r-l+1<ans[0]){
	                    ans[0] = r-l+1;
	                    ans[1] = l;
	                    ans[2] = r;
	                }
	                mapL.put(c,mapL.get(c)-1);
	                if(map.containsKey(c) && mapL.get(c)<map.get(c)){
	                    form--;
	                }
	                l++;
	            }
	            r++;
	        }
	        return ans[0]==-1 ? "":
	        						large.substring(ans[1],ans[2]+1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String large = s.nextLine();
		String small = s.nextLine();
		System.out.println(smallSubString(large, small));

	}

}
