package io;

import java.io.*;

/**
 *
 */
public class BRDemo {
    public static void main(String[] args) throws IOException {
        //将当前源代码输出到控制台上
        //低级流，从文件中读取字节
        FileInputStream fis = new FileInputStream("fos.txt");
        //高级流，衔接字符流与字节流2：将读取的字节转换为字符
        InputStreamReader isr = new InputStreamReader(fis);
        //高级流，块读加速，按行读取字符串
        BufferedReader br = new BufferedReader(isr);
        /*
        String readLine()
        读取一行字符串。；连续读取若干字符，当遇到换行符时停止，并将前面的内容以一个字符串的形式返回。若为null,则表示为流读取到了末尾
         */
        String line;
        while ((line = br.readLine())!=null){
            System.out.println(line);
        }
        br.close();
    }
}
