package DSA;
import java.util.* ;

public class previousSmallerElement {
    public static int[] prevSmaller (int[] arr){
        int[] result= new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i< arr.length; i++){
            int prevSmaller = -1;
            while(!st.isEmpty()) {
                int top = st.pop();
                if(top<arr[i]){
                    prevSmaller = top;
                    st.push(top);
                    break;
                }
            }
            result[i] = prevSmaller;
            st.push(arr[i]);
        }
        return result;

    }
    public static void main(String[] args){
        int[] arr = {6,9,7,8,4,2,3,5,1};
        int[] ans = prevSmaller(arr);
        System.out.println(Arrays.toString(ans));

    }
}
