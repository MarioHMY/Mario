package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * 使用文件流向文件中写入文本数据
 */
public class WriStringDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("fos.txt");
        String line = "等你死了，我要坐飞机去你坟头，疯狂的，偷吃你的贡品";

        /*
            String提供了将字符串转换为一组字节的方法
            byte[] getBytes(String charsetName)
            参数为字符集的名字，常用的是UTF-8。
            其中中文字3字节表示1个，英文1字节表示1个。

            UTF-8称为万国码，互联网中最常用的字符集。是Unicode的变长编码。
            GBK是我国的国标编码，英文占1字节，中文占2字节。
         */
        byte[] data = line.getBytes("UTF-8");
        fos.write(data);

        line = "啊对对对";
        data = line.getBytes("UTF-8");
        fos.write(data);

        System.out.println("写入完毕！");
        fos.close();
    }
}
