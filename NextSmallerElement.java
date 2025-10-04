package DSA;

import java.util.Arrays;

public class NextSmallerElement {
    public static int[] nextSmaller(int[] arr){
        int[] ans= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            ans[i]=-1;
            for(int j =i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    ans[i]=arr[j];
                    break;
                }
            }

        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={6,3,7,5,3,2,2,6,7};
        int[] res = nextSmaller(arr);
        System.out.println(Arrays.toString(res));
    }
}
