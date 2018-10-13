package easy;

public class JewelsandStones {
    public static int numJewelsInStones(String J, String S) {
        char[] type = J.toCharArray();  //表示多少种宝石
        int count = 0; //记录宝石数目
        for(int i = 0;i < S.length();i++){
            for(int j = 0;j < type.length;j++){
                if(type[j] == S.charAt(i)){
                    count ++;
                }
            }
        }
        return count;
    }
    public static void main(String arg[]){
        System.out.println(numJewelsInStones("aA","aAAbbbb") + " ");
        System.out.println(numJewelsInStones("z","ZZ") + " ");
        System.out.println(numJewelsInStones("XcZYx","XcZYYYXZkgfdjgkfdjgkjdkgjfdkjgccZZZYxxx") + " ");
    }
}
