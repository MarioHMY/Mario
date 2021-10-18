package string;

public class Test {
    public static void main(String[] args) {
        String name1 = getHostName("www.tedu.com");
        String name2 = getHostName("http://doc.canglaoshi.org");
        String name3 = getHostName("www.tarena.com.cn");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
    }
    public static String getHostName(String line){
        int start = line.indexOf(".")+1;
        int end = line.indexOf(".",start);
        return line.substring(start,end);
    }
}
