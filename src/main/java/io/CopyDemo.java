package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */
public class CopyDemo {
    public static void main(String[] args) throws IOException {
        //创建文件输入流读取原文件
        FileInputStream fis = new FileInputStream("Image.png");
        //创建文件输出流写复制文件
        FileOutputStream fos = new FileOutputStream("Image_cp.png");
        /*
            原文件数据:
            10110011 10100011 11110000 10101010 ....
            ^^^^^^^^
            d = fis.read()

            d:00000000 00000000 00000000 10100011
                                         ^^^^^^^^
            fos.write(d)
            复制文件
            10110011
         */
         int d;//用来保存每次读取到的数据
        long start = System.currentTimeMillis();
         while ((d = fis.read()) !=-1){
             fos.write(d);

         }
         long end = System.currentTimeMillis();
        System.out.println("复制完毕！耗时"+(end-start)+"ms");
         fis.close();
         fos.close();
    }
}
