package datastructures.arrays.object;

/**
 * Created by zhonghao.han on 5/31/2018.
 * 8演示操作直接使用数据操作有序数组,存放不重复的对象
 */
public class OperateOrderNoIndexObject {
    private UserModel1[] datas = null;//定义数据

    private int currentIndex = 0;//定义索引

    public OperateOrderNoIndexObject(int length) {
        datas = new UserModel1[length];
    }

    public int insert(UserModel1 data) {
        //假设顺序是升序
        int index = 0;
        //1.查找数据data应该存放的位置
        for (index = 0; index < currentIndex; index++) {
            if (datas[index].getUuid() > data.getUuid()) {
                break;
            }
        }
        //2.把这个位置及其后面的数据，向后移动一位
        for (int i = currentIndex; i > index; i--) {
            datas[i] = datas[i - 1];
        }
        //3.把data设置到应该存放的位置
        datas[index] = data;

        currentIndex++;
        return currentIndex - 1;//返回自增前的地址
    }

    public int getIndex(int uuid) {
        int index = -1;
        for (int j = 0; j < currentIndex; j++) {
            if (datas[j].getUuid() == uuid) {
                index = j;
                break;
            }
        }
        return index;
    }

    public void remove(int uuid) {
        //1.查找这个数据对应的索引
        int index = getIndex(uuid);
        //2.同使用索引的而方法，由索引删除数据
        for (int i = index; i < currentIndex; i++) {
            datas[i] = datas[i + 1];
        }
        currentIndex--;
    }

    public UserModel1 searchOne(int uuid) {
        //1.查找这个数据对应的索引
        int index = getIndex(uuid);
        //2.如果有，就返回datas中的数据
        if (index >= 0) {
            return datas[index];
        }
        //3.如果没有，就返回null;
        return null;

    }

    public void printDatas() {
        System.out.println("==================");
        for (UserModel1 d : datas) {
            System.out.println(d);
        }
    }

    public static void main(String args[]) {
        OperateOrderNoIndexObject op = new OperateOrderNoIndexObject(10);

        op.insert(new UserModel1(1,"张三",6));
        op.insert(new UserModel1(2,"haha",7));
        op.insert(new UserModel1(3,"的话",6));
        op.insert(new UserModel1(6,"撒复合物",5));
        op.insert(new UserModel1(7,"收到回复",3));
        op.insert(new UserModel1(4,"蔬菜如何",16));


        op.remove(3);
        op.printDatas();

        UserModel1 model1 = op.searchOne(4);
        System.out.println("result : " + model1);
    }
}
