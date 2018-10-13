package easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParity {
    public static int[] sortArrayByParity(int[] A) {
        Arrays.sort(A);
        List<Integer> old = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0;i < A.length;i++){
            if(A[i] % 2 == 0){
                even.add(A[i]);
            }else{
                old.add(A[i]);
            }
        }
        even.addAll(old);
        for(int i = 0;i < even.size();i++){
            A[i] = even.get(i);
        }
        return A;
    }
    public static void main(String[] args){
        int[] arr = {3,1,2,4};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }
}
