package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 使用对象输入流完成对象的反序列化
 */
public class OISDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //读取person.obj文件，将对象进行反序列化
        FileInputStream fis = new FileInputStream("person.obj");
        ObjectInputStream ois = new ObjectInputStream(fis);
        /*
            Object readObject()
            对象输入流提供的该方法用于进行对象反序列化
            注意:若读取的字节不是通过对象输出流序列化的一组字节，则会抛出异常
            ClassNotFoundException
         */
        Person p = (Person)ois.readObject();
        System.out.println(p);

        ois.close();
    }
}