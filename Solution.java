// Search for integers with given difference and at given distance
   //Time Complexity: O(N^2)
	//	Space Complexity: O(N)

import java.util.Scanner;

public class Solution {
    public static int diff(int x,int y){
        int k = x-y;
        if(k>0) return k;
        else return -k;
    }
 public static boolean SearchIntegerPair(int n,int k, int m, int[] arr){  
            for(int j=0;j<n-1;j++)
            {
                    for(int x=j+1;x<=Math.min(j+k,n-1);x++){
                        if((diff(arr[j],arr[x])<=m)){
                            return true;
                        }
                    }    
            }
            return false;
 }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int T = sc.nextInt();
        for(int i=1;i<=T;i++){
            int n =sc.nextInt();
            int k =sc.nextInt();
            int m =sc.nextInt();
     	    int[] arr = new int[n];
             for(int j=0;j<n;j++){ 
                arr[j] = sc.nextInt();
            }
          if(SearchIntegerPair(n,k,m,arr)) System.out.println("valid");
          else  System.out.println("invalid");
        }
	}
}
