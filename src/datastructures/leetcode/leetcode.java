package datastructures.leetcode;

import java.util.HashSet;
import java.util.Set;

public class leetcode {



  public static int numUniqueEmails(String[] emails) {
    Set<String> normalized = new HashSet<>();
    String part1;
    String part3;
    for(int i =0;i<emails.length;i++){
      if (emails[i].contains("+")){
        part1 = emails[i].substring(0,emails[i].indexOf("+"));
      }else{

        part1= emails[i].substring(0,emails[i].indexOf("@"));
      }
        part3=part1.replaceAll("\\.","");

      String part2=emails[i].substring(emails[i].indexOf("@"));
      String result = part3+part2;
      normalized.add(result);
    }

    return normalized.size();
  }

  public static int numUniqueEmailsMethod2(String[] emails) {
    HashSet<String> objects = new HashSet<>();
    for (String email:emails){
      int i = email.indexOf("@");
      String local = email.substring(0,i);
      String rest = email.substring(i);
      if(local.contains("+")){
        local= local.substring(0,local.indexOf("+"));
      }
      local= local.replaceAll(".","");
      objects.add(local+rest);
    }
    return objects.size();

  }

  public static void main(String[] args) {
    String[] a={"testemail@datastructures.leetcode.leetcode.com","testemail1@datastructures.leetcode.leetcode.com","testemail+david@lee.tcode.com"};

    int i = numUniqueEmails(a);
    System.out.println(i);
  }
}
