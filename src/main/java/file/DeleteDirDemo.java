package file;

import java.io.File;

/**
 * 删除一个目录
 */
public class DeleteDirDemo {
    public static void main(String[] args) {
        File dir = new File("demo");

        if(dir.exists()){
            dir.delete();//delete方法删除目录时只能删除空目录
            System.out.println("文件已删除！");
        }else{
            System.out.println("文件不存在！");
        }
    }
}
