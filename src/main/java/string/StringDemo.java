package string;

/**
 * 字符串String
 * 内部使用char数组保存的所有字符，每个字符为2字节，存的是该字符Unicode编码
 * 字符串是不变对象，一旦创建内容不可改变，若改变会创建新对象
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "123abc";
        String s2 = "123abc";
        System.out.println(s1==s2);
        String s3 = new String("123abc");//新new了一个对象8
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));//比较s1与s3字符串内容
        s1=s1+"!";
        System.out.println(s1==s2);//改变就创建新对象

    }
}