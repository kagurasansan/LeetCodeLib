package easy;

import java.util.Arrays;

public class RobotReturntoOrigin {

    public static boolean judgeCircle(String moves) {
         int[] count = new int[]{0,0,0,0};
         for(int i = 0;i < moves.length();i ++){
             if(moves.charAt(i) == 'U'){
                 count[0] = count[0] + 1;
             }else if(moves.charAt(i) == 'D'){
                 count[1] = count[1] + 1;
             }else if(moves.charAt(i) == 'L'){
                 count[2] = count[2] + 1;
             }else{
                 count[3] = count[3] + 1;
             }
         }
         if(count[0] == count[1] && count[2] == count[3]){
             return true;
         }else{
             return false;
         }
    }
    public static void main(String args[]){
        System.out.println(judgeCircle("UD"));
    }
}
