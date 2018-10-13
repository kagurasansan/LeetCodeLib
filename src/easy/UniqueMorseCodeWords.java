package easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords {
    public static void main(String arg[]){
        String[] result = {"gin", "zen", "gig", "msg"};
        System.out.println( uniqueMorseRepresentations(result));
    }
    public static int uniqueMorseRepresentations(String[] words) {
        String[] ar ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> result =new HashSet<String>();
        for(int i = 0;i < words.length; i++){
            StringBuilder builder = new StringBuilder();
            for(int j = 0;j < words[i].length();j++){
                int index = (int)(words[i].charAt(j) - 97);
                builder.append(ar[index]);
            }
            result.add(builder.toString());
        }
        return result.size();
    }
}
