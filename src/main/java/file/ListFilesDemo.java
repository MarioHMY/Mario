package file;

import java.io.File;

/**
 * 获取目录中所有子项
 */
public class ListFilesDemo {
    public static void main(String[] args) {
        //获取当前目录下所有子项
        File dir = new File(".");
        /*
        boolean isFile()
        判断当前File表示的是否为一个文件
        boolean isDirectory()
        判断当前File表示的是否为一个目录
         */
        if(dir.isDirectory()){
            File[] subs = dir.listFiles();
            System.out.println("有"+subs.length+"个子项");
            for(int i=0;i< subs.length;i++){
                File sub = subs[i];
                System.out.println(sub.getName());
            }
        }
    }
}
