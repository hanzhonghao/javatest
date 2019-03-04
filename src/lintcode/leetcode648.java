package lintcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode648 {
  public static String replaceWords(List<String> roots, String sentence) {
    Set<String> rootset = new HashSet();
    for (String root: roots) rootset.add(root);

    StringBuilder ans = new StringBuilder();
    for (String word: sentence.split("\\s+")) {
      String prefix = "";
      for (int i = 1; i <= word.length(); ++i) {
        prefix = word.substring(0, i);
        if (rootset.contains(prefix)) break;
      }
      if (ans.length() > 0) ans.append(" ");
      ans.append(prefix);
    }
    return ans.toString();
  }

  public static void main(String[] args) {
    List<String> roots =new ArrayList<>();
    roots.add("cat");
    roots.add("bat");
    roots.add("rat");

    String sentence = "the cattle was rattled by the battery";
    String s = replaceWords(roots, sentence);
    System.out.println(s);

  }

}
