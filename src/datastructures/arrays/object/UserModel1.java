package datastructures.arrays.object;

/**
 * Created by zhonghao.han on 6/1/2018.
 * 7
 */
public class UserModel1 {
    private int uuid;
    private String name;
    private int age;

    public UserModel1(int uuid, String name, int age) {
        this.uuid = uuid;
        this.name = name;
        this.age = age;
    }

    public int getUuid() {
        return uuid;
    }

    public void setUuid(int uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserModel1{" +
                "uuid=" + uuid +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
