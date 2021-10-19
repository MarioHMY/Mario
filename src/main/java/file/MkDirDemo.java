package file;

import java.io.File;

public class MkDirDemo {
    public static void main(String[] args) {
        //在当前文件下创建一个目录：demo
        //File dir = new File("demo");
        File dir = new File("./a/b/c/d/f");

        if(dir.exists()){
            System.out.println("该目录已存在！");
        }else{
            dir.mkdir();//创建目录时要求所在目录必须存在
            dir.mkdirs();//创建目录时会将路径上的所有不存在的目录一同创建
            System.out.println("目录已创建！");
        }
    }
}
