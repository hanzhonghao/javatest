package datastructures.simplesort;

/**
 * Created by zhonghao.han on 6/4/2018.
 * 插入排序
 * 优势就是，一旦前边都是排好序的，排序的速度会非常快
 */
public class InsertSort {
    public void insertSort(int[] as) {
        //因为假定第一个位置是排好序的
        int j = 0;
        for (int i = 1; i < as.length; i++) {
            int temp = as[i];
            for (j = i; j > 0; j--) {
                //如果前边比后边的大就交换
                if (as[j - 1] >= temp) {
                    as[j] = as[j - 1];
                }else{
                    break;
                }
            }
            as[j]= temp;
        }
    }

    private void printDatas(int[] as){
        System.out.println("++++++++++++++++++++++++++");
        for (int d:as){
            System.out.println(d);
        }
    }

    public static void main(String[] args){

        InsertSort selectSort = new InsertSort();
        int[] as = new int[]{3,2,5,6,7,8};
        selectSort.insertSort(as);
        selectSort.printDatas(as);
    }
}
