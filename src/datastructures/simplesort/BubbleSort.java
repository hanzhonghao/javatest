package datastructures.simplesort;

/**
 * Created by zhonghao.han on 6/2/2018.
 * 演示冒泡排序
 */
public class BubbleSort {

    public void bubbleSort(int[] as) {
        //1.用来控制比较的次数
        for (int i = as.length-1; i > 0; i--) {
            //下面的循环完成，表示一轮的冒泡完成
            for (int j = 0; j < i; j++) {
                if (as[j] > as[j + 1]) {
                    //如果前边的数据比后边的数据大，就交换
                    swap(as, j, j + 1);
                }
            }
        }
    }

    public void bubbleSort2(int[] as) {
          //外层去一个用来比较的数据位置
        for (int i=0;i<as.length-1;i++){
            //内层循环依次去除需要用来比较的数据
            for (int j=i+1;j<as.length;j++){
                if(as[i]>as[j]){
                    swap(as, i,j);
                }
            }
        }
    }


    private void swap(int[] as, int aIndex, int bIndex) {
        int temp = as[aIndex];
        as[aIndex] = as[bIndex];
        as[bIndex] = temp;
    }

    private void printDatas(int[] as){
        System.out.println("++++++++++++++++++++++++++");
        for (int d:as){
            System.out.println(d);
        }
    }

    public static void main(String[] args){

        BubbleSort bubbleSort = new BubbleSort();
        int[] as = new int[]{3,2,5,6,7,8};
//        bubbleSort.bubbleSort(as);
        bubbleSort.bubbleSort2(as);
        bubbleSort.printDatas(as);
    }
}
