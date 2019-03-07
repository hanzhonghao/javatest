package datastructures.leetcode;

import java.util.HashSet;
import java.util.Set;

public class leetcode804 {

  String[] pattern ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

  public int uniqueMorseRepresentations(String[] words) {
    Set<String> code =new HashSet<>();
    for(String word:words){
      StringBuilder sb = new StringBuilder();
      for (char c:word.toCharArray()){
        sb.append(pattern[c - 'a']);
      }
      code.add(sb.toString());
    }
    return code.size();
  }

  public static void main(String[] args) {
    String[] words = {"gin", "zen", "gig", "msg"};
    leetcode804 leetcode804 = new leetcode804();
    int i = leetcode804.uniqueMorseRepresentations(words);
    System.out.println(i);
  }

}
