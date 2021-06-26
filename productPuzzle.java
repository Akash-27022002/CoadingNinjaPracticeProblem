// time complexcity O(n)  space complexcity O(n)

		public class Solution {

    public static int mod = (int) (1e9 + 7);

    public static int[] productPuzzle(int[] arr, int n) {

       int[] left = new int[n];
       int[] right = new int[n];
       int[] prod = new int[n]; 
       for(int i=0;i<n;i++){
           if(i==0) left[i]=arr[i];
           else left[i] = (int) (((long) left[i-1]*arr[i])%mod);
       }
       for(int i=n-1;i>=0;i--){
           if(i==n-1) right[i] = arr[i];
           else right[i] = (int)  (((long)right[i+1]*arr[i])%mod);
       } 
      for(int i=0;i<n;i++){
          if(i==0) prod[i] = right[i+1];
          else if(i==n-1) prod[i] = left[i-1];
          else{
              prod[i]=(int) (((long)left[i-1]*right[i+1])%mod);
          }
      } 
        return prod;
    }
}
