package datastructures.simplesort;

/**
 * Created by zhonghao.han on 6/2/2018.
 * 选择排序
 */
public class SelectSort {
    public void selectSort(int[] as) {
        int min = 0;
        for (int i = 0; i < as.length - 1; i++) {
            //设置初始的最小位置
            min = i;
            for (int j = i + 1; j < as.length; j++) {
                if (as[min] > as[j]) {
                    min = j;
                }
            }
            swap(as,min,i);
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

        SelectSort selectSort = new SelectSort();
        int[] as = new int[]{3,2,5,6,7,8};
        selectSort.selectSort(as);
        selectSort.printDatas(as);
    }
}
