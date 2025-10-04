package DSA;
import java.util.*;

class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res= new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            int next_greater = -1;
            int index = 0;
            for(int j=0; j<nums2.length; j++){
                if(nums2[j]==nums1[i]){
                    index = j;
                    break;                }
            }
            for(int j=index; j<nums2.length; j++){
                if(nums2[j] > nums1[i]){
                    next_greater = nums2[j];
                    break;
                }
            }
            res[i] = next_greater;
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums1 ={4, 1, 2};
        int[] nums2= {1, 3, 4, 2};
        int[] result = nextGreaterElement(nums1, nums2);
        System.out.println("Next Greater Elements: " + Arrays.toString(result));


    }
}