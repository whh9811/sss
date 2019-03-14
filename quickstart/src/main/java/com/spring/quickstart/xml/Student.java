package com.spring.quickstart.xml;

/**
 * Created by lenovo on 2019/2/25.
 */
public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student(){

    }

    public Student(String name,int age) {
        this.name = name;
        this.age=age;
    }

    private  String name;

    public Student(com.soft1721.spring.hello.Phone phone) {
        this.phone = phone;
    }

    public com.soft1721.spring.hello.Phone getPhone() {
        return phone;
    }

    public void setPhone(com.soft1721.spring.hello.Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "phone=" + phone +
                '}';
    }

    private Phone phone;
    private  int age;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

