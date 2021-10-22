package io;

import java.io.*;
import java.util.Scanner;

/**
 * 简易记事本工具
 * 程序启动后要求输入一个文件名，然后对该文件写操作
 * 之后用户输入的，每行字符串都写入到文件（写入到文件中的数据不考虑换行)
 * 单独输入exit时程序退出
 */
public class NoteDemo {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件名");
        String fileName = scan.nextLine();
        FileOutputStream fos = new FileOutputStream(fileName);
        System.out.println("请开始输入内容，单独输入exit时退出");
        while (true){
            String line = scan.nextLine();
            if("exit".equals(line)){
                break;
            }
            byte[] data = line.getBytes("utf-8");
            fos.write(data);
        }
        System.out.println("再见");
        fos.close();
    }
}
