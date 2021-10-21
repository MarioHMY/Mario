package file;

import java.io.File;

/**
 * 删除一个目录
 */
public class Test {
    public static void main(String[] args) {
        File dir = new File("a");
        delete(dir);
        System.out.println("删除完毕！");
    }
    public static void delete(File f){
        //如果f是一个目录，则需要先将该目录子项全部删除，才能删除
        //如果f是一个文件，可以直接调用File对象的delete直接删除
        if(f.isDirectory()){
            File[] subs = f.listFiles();
            for(int i=0;i<subs.length;i++){
                File sub = subs[i];
                /*
                在一个方法内部调用这个方法的现象叫做递归调用
                递归是一种特殊的循环操作
                使用递归要注意：
                方法内部调用本方法应当在一个分支中，不能必定执行，否则是死循环
                递归开销大，性能差，尽量避免使用
                 */
                delete(sub);//递归调用
            }
        }
        f.delete();
    }
}
