
import java.util.List;
import java.util.Scanner;
public class Solution {

    public static int[] linearProbing(List<Integer> keys) {
        // Write your code here.
        Scanner sc = new Scanner(System.in);
        int m= keys.size();
        int[] arr = new int[m];
        for(int i=0;i<m;i++){
            int x=keys.get(i)%m;
            if(arr[x]==0) arr[x] = keys.get(i);
            else{
                for(int j=0;j<m;j++){
                    if(x<m-1) x++;
                    else x=0;
                    if(arr[x]==0) {
                        arr[x] = keys.get(i);
                        break;
                    }
                }
            }
        }
        return arr;
    }

}
