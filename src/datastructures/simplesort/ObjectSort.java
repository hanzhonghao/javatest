package datastructures.simplesort;

import datastructures.arrays.object.UserModel1;

/**
 * Created by zhonghao.han on 6/4/2018.
 * 对象排序
 */
public class ObjectSort {
    public void objectSort(UserModel1[] ums) {
        //因为假定第一个位置是排好序的
        int j = 0;
        for (int i = 1; i < ums.length; i++) {
            UserModel1 temp = ums[i];
            for (j = i; j > 0; j--) {
                //如果前边比后边的大就交换
                if (ums[j - 1].getUuid() >= temp.getUuid()) {
                    ums[j] = ums[j - 1];
                } else {
                    break;
                }
            }
            ums[j] = temp;
        }

    }

    public void objectSort2(UserModel1[] ums) {
        //因为假定第一个位置是排好序的
        int j = 0;
        for (int i = 1; i < ums.length; i++) {
            UserModel1 temp = ums[i];
            for (j = i; j > 0; j--) {
                //如果前边比后边的大就交换
                if (ums[j - 1].getName().compareTo(temp.getName())>0 ) {
                    ums[j] = ums[j - 1];
                } else {
                    break;
                }
            }
            ums[j] = temp;
        }

    }


    private void printDatas(UserModel1[] ums) {
        System.out.println("++++++++++++++++++++++++++");
        for (UserModel1 d : ums) {
            System.out.println(d);
        }
    }

    public static void main(String[] args) {

        ObjectSort objectSort = new ObjectSort();
        UserModel1[] ums = new UserModel1[]{
                new UserModel1(1, "张三1", 6),
                new UserModel1(2, "haha2", 7),
                new UserModel1(3, "的话3", 6),
                new UserModel1(6, "撒复合物6", 5),
                new UserModel1(7, "收到回复7", 3),
                new UserModel1(4, "蔬菜如何4", 16)};

        objectSort.objectSort(ums);
        objectSort.printDatas(ums);

        System.out.println("++++++++++++++++++++++++++");

        objectSort.objectSort2(ums);
        objectSort.printDatas(ums);

    }
}
