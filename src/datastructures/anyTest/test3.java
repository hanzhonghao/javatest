package datastructures.anyTest;

import java.util.*;

public class test3 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    List<String> list2 = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();

    list.add("www.baidu.com");
    list.add("www.zhonghao.com");
    list.add("www.xiaojie.com");
    list.add("www.dumeng.com");
    list.add("www.baidu.com");
    list.add("www.zhonghao.com");
    list.add("www.xiaojie.com");
    list.add("www.dumeng.com");
    list.add("www.zhonghao.com");
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
    //    System.out.println("count=" + count);
    list2.clear();

    //迭代Map集合,重复数据出现最多的加入list3集合
    Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<String, Integer> entry = it.next();
      if (entry.getValue() == count) {
        list2.add(entry.getKey());
        System.out.println("key=" + entry.getKey() + " ," + " value=" + entry.getValue());
      }
    }
    if (list2.size() > 1) {
      System.out.println(list2 + "出现的次数一样多,一共出现了:" + (count + 1) + "次");
    }
    if (list2.size() == 1) {
      System.out.println("出现最多次数的是:" + list2 + ",总共出现了:" + (count + 1) + "次");
    }
  }
}
