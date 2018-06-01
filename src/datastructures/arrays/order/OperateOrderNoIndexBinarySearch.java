package datastructures.arrays.order;

/**
 * Created by zhonghao.han on 5/31/2018.
 * 6演示操作二分法查找
 */
public class OperateOrderNoIndexBinarySearch {
    private int[] datas = null;//定义数据

    private int currentIndex = 0;//定义索引

    public OperateOrderNoIndexBinarySearch(int length) {
        datas = new int[length];
    }

    public int insert(int data) {
        //假设顺序是升序
        int index =0;
        //1.查找数据data应该存放的位置。
        for (index=0;index<currentIndex;index++){
            if(datas[index]>data){
                break;
            }
        }
        //2.把这个位置及其后面的数据，向后移动一位。
        for (int i =currentIndex;i>index;i--){
            datas[i]=datas[i-1];
        }
        //3.把data设置到应该存放的位置。
        datas[index] = data;

        currentIndex++;
        return currentIndex -1;//返回自增前的地址
    }

    public int binarySearch(int data) {
        int index = -1;

        //用来表示小的这边的索引
        int lowIndex=0;
        //用来表示大的这边的索引
        int highIndex=currentIndex-1;//因为插入的时候最后的索引是++

        while(true){
            //1.找到中间的位置
            index= ( lowIndex + highIndex )/2;
            //2.把要查找的数据和中间索引位置的数据进行比较
            if(lowIndex>highIndex){
                //没找到数据
                return -1;
            }else if(datas[index]==data){
                return index;
            }else{
                if (data<datas[index]) {
                    highIndex = index-1;
                }else{
                    lowIndex = index +1;
                }
            }
        }
    }



    public void printDatas() {
        System.out.println("==================");
        for (int d : datas) {
            System.out.println(d);
        }
    }

    public static void main(String args[]) {
        OperateOrderNoIndexBinarySearch op = new OperateOrderNoIndexBinarySearch(20);
        op.insert(1);
        op.insert(3);
        op.insert(4);
        op.insert(6);
        op.insert(7);
        op.printDatas();

        int i = op.binarySearch(4);
        System.out.println("result index is :"+ i);


    }
}
