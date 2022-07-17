package genericity01;

import java.rmi.activation.ActivationGroup;

public class Introduction implements Info{
    private String name;
    private int age;

    public Introduction(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return this.getName()+","+this.getAge();
    }
}
