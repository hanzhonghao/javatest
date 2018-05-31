package datastructures.arrays.noorder;

/**
 * Created by zhonghao.han on 5/31/2018.
 * 通过索引演示操作无序数组
 */
public class OperateWithIndex {
    private int[] datas = null;//定义数据

    private int currentIndex = 0;//定义索引

    public OperateWithIndex(int length) {
        datas = new int[length];
    }

    public int insert(int data) {
        datas[currentIndex] = data;
        currentIndex++;
        return currentIndex - 1;
    }

    public void remove(int index) {
        for (int i = index; i < currentIndex; i++) {
            datas[i] = datas[i + 1];
        }
        currentIndex--;
    }

    public int searchOne(int index) {
        return datas[index];
    }

    public void printDatas() {
        System.out.println("==================");
        for (int d : datas) {
            System.out.println(d);
        }
    }

    public static void main(String args[]) {
        OperateWithIndex op = new OperateWithIndex(20);
        op.insert(1);
        op.insert(3);
        op.insert(4);
        op.insert(6);
        op.insert(6);
        op.insert(7);
        op.printDatas();

        op.remove(3);
        op.printDatas();

        int result = op.searchOne(3);
        System.out.println("result : " + result);
    }
}
