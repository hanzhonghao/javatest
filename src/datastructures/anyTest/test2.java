package datastructures.anyTest;

import java.util.*;

public class test2 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();

    list.add("www.baidu.com");
    list.add("www.baidu.com");
    list.add("www.dumeng.com");
    list.add("www.dumeng.com");
    list.add("www.zhonghao.com");
    list.add("www.zhonghao.com");
    list.add("www.zhonghao.com");
    list.add("www.xiaojie.com");
    list.add("www.xiaojie.com");
    list.add("www.xiaojie.com");
    list.add("www.xiaojie.com");
    list.add("www.xiaojie.com");
    int count = 0;

    //重复的加入list2集合
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i).equals(list.get(j))) {
          list2.add(list.get(i));
          break;
        }
      }
    }
    //统计list2集合中重复数据出现次数,对应放入Map集合
    for (String obj : list2) {
      if (map.containsKey(obj)) {
        count++;
        map.put(obj, map.get(obj) + 1);
      } else {
        map.put(obj, 1);
      }
    }
    list2.clear();

      Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String, Integer>>() {
        @Override public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
          return o1.getValue().compareTo(o2.getValue());
        }
      };
      // map转换成list进行排序
      List<Map.Entry<String, Integer>> sortList = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
      // 排序
      Collections.sort(sortList, valueComparator);

      Iterator<Map.Entry<String, Integer>> iterator = sortList.iterator();

    while (iterator.hasNext()) {
      Map.Entry<String, Integer> entry = iterator.next();
      Integer value = entry.getValue();
      int keyValue = value.intValue() + 1;
      String key = entry.getKey();
      System.out.println(key+ ": "+ keyValue );
    }

  }

}
