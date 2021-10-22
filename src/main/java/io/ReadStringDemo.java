package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 从文件中读取文本数据
 */
public class ReadStringDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] data = new byte[1024];
        int len = fis.read(data);
        System.out.println("实际读取到了"+len+"个字节");
            /*
            String提供了将字节数组转换为字符串的构造方法：
            String(byte[]data,String charsetName)
            将给定的字节数组中所有字节按照指定的字符集转换为字符串

            String(byte[]data,int offset,int len,String charsetName)
            将给定的字节数组从下标offset处开始的连续len个字节按照指定的字符集转换为字符串
         */
        String line = new String(data,0,len,"utf-8");
        System.out.println(line);
        System.out.println(line.length());
        fis.close();
    }
}
