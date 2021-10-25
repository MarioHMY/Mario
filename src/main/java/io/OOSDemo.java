package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * 对象流
 * java.io.ObjectOutputStream和ObjectInputStream
 * 对象流是一对高级流，用于进行对象的序列化与反序列化
 *
 */
public class OOSDemo {
    public static void main(String[] args) throws IOException {
        //将一个Person对象写入文件person.obj中。
        FileOutputStream fos = new FileOutputStream("person.obj");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        String name = "苍老师";
        int age = 18;
        String gender = "女";
        String[] otherInfo = {"是一名演员","来自岛国","促进中日文化交流","启蒙老师"};
        Person p = new Person(name,age,gender,otherInfo);
        System.out.println(p);
        /*
            void writeObject(Object obj)
            对象流提供的该方法可以进行对象序列化。

            该方法要求序列化的对象必须实现可序列化接口(java.io.Serializable)，
            否则会抛出异常:
            java.io.NotSerializableException: io.Person
         */
        oos.writeObject(p);
        System.out.println("写出完毕!");

        oos.close();

    }
}
