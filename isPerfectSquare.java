//// time complexcity O(n)  space complexcity O(1)

// check sqrt without using library
//time complexcity is O(n)
public class Solution {
    public static boolean isPerfectSquare(long n) {
        // Write your code here.
       long left = 1,right=n;
        while(left<=right){
            long mid = (left+right)/2;
            if(mid*mid==n) return true;
            if(mid*mid<n) left= mid+1;
            else right = mid -1;
        }
        return false;
    }
}
