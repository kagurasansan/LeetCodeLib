package easy;

public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        String result = Integer.toBinaryString(x^y);
        int count = 0;
        for(int i = 0;i < result.length();i++){
            if(result.charAt(i) == '1'){
                count ++;
            }
        }
        return count;

    }

    public static void main(String args[]){
        System.out.println(hammingDistance(1,4));

    }
}
