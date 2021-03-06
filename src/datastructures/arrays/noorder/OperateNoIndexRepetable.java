package datastructures.arrays.noorder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhonghao.han on 5/31/2018.
 * 3演示操作直接使用数据操作无无序数组,*** 存放重复的值
 */
public class OperateNoIndexRepetable {
    private int[] datas = null;//定义数据

    private int currentIndex = 0;//定义索引

    public OperateNoIndexRepetable(int length) {
        datas = new int[length];
    }

    public int insert(int data) {
        datas[currentIndex] = data;
        currentIndex++;
        return currentIndex - 1;
    }
/**
 *获取数据data在数组中的索引位置
 * begin 开始查找的位置
 * data  查找索引的数据
 * return 从开始位置往后的第一个索引
 */
    public int getIndex(int begin,int data) {
        int index = -1;
        for (int j = begin; j < currentIndex; j++) {
            if (datas[j] == data) {
                index = j;
                break;
            }
        }
        return index;
    }

    public void remove(int data) {
        //1.查找这个数据对应的索引
        int index = getIndex(0,data);
        //循环向后查找这个索引，直到找不到为止
        while(index>=0){
            //2.同使用索引的而方法，由索引删除数据
            for (int i = index; i < currentIndex; i++) {
                datas[i] = datas[i + 1];
            }
            currentIndex--;
            //再次查找后续的数据对应的索引
            index= getIndex(index,data);
        }
    }

    public List<Integer> searchOne(int data) {
        List<Integer> reList =  new ArrayList<>();
        //1.查找这个数据对应的索引
        int index = getIndex(0,data);
        while(index>=0){
            //2.如果有，就添加到要返回的集合中
            reList.add(datas[index]);
            //再次查找后续的数据对应的索引
            index= getIndex(index+1,data);
        }
        return reList;

    }

    public void printDatas() {
        System.out.println("==================");
        for (int d : datas) {
            System.out.println(d);
        }
    }

    public static void main(String args[]) {
        OperateNoIndexRepetable op = new OperateNoIndexRepetable(20);
        op.insert(1);
        op.insert(3);
        op.insert(3);
        op.insert(4);
        op.insert(6);
        op.insert(6);
        op.insert(7);
        op.printDatas();

        op.remove(3);
        op.printDatas();

        List<Integer> result = op.searchOne(6);
        System.out.println("result : " + result);
    }
}
