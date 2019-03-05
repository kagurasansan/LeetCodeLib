package easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class Problem961 {



    public static void main(String[] args){
        int[] dat ={2,1,2,5,3,2};
        System.out.println(repeatedNTimes(dat) + "");
    }

    public static int repeatedNTimes(int[] A) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int data = 1;
        for(int i = 0;i < A.length;i ++){
            if(hashMap.containsKey(A[i])){
                data = hashMap.get(A[i]);
                data = data + 1;
                hashMap.put(A[i],data);
            }else{
                hashMap.put(A[i],1);
            }
        }

        for(Integer key:hashMap.keySet()) {
            if(hashMap.get(key) == A.length / 2){
                return key;
            }
        }
        return -1;
    }
}
