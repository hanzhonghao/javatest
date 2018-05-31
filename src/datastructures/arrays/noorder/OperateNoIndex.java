package datastructures.arrays.noorder;

/**
 * Created by zhonghao.han on 5/31/2018.
 * 演示操作直接使用数据操作无无序数组,存放不重复的值
 */
public class OperateNoIndex {
    private int[] datas = null;//定义数据

    private int currentIndex = 0;//定义索引

    public OperateNoIndex(int length) {
        datas = new int[length];
    }

    public int insert(int data) {
        datas[currentIndex] = data;
        currentIndex++;
        return currentIndex - 1;
    }

    public int getIndex(int data) {
        int index = -1;
        for (int j = 0; j < currentIndex; j++) {
            if (datas[j] == data) {
                index = j;
                break;
            }
        }
        return index;
    }

    public void remove(int data) {
        //1.查找这个数据对应的索引
        int index = getIndex(data);
        //2.同使用索引的而方法，由索引删除数据
        for (int i = index; i < currentIndex; i++) {
            datas[i] = datas[i + 1];
        }
        currentIndex--;
    }

    public int searchOne(int data) {
        //1.查找这个数据对应的索引
        int index = getIndex(data);
        //2.如果有，就返回datas中的数据
        if (index >=0) {
            return datas[index];
        }
        //3.如果没有，就返回0;
        return 0;

    }

    public void printDatas() {
        System.out.println("==================");
        for (int d : datas) {
            System.out.println(d);
        }
    }

    public static void main(String args[]) {
        OperateNoIndex op = new OperateNoIndex(20);
        op.insert(1);
        op.insert(3);
        op.insert(4);
        op.insert(6);
        op.insert(7);
        op.printDatas();

        op.remove(3);
        op.printDatas();

        int result = op.searchOne(3);
        System.out.println("result : " + result);
    }
}
