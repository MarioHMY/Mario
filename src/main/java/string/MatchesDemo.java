package string;

/**
 * 正则表达式:
 * 正则表达式是用来描述一个字符串的内容格式,使用它通常用来匹配一个字符串的内容是否符合
 * 格式要求.
 * 基本语法:
 * []:表示一个字符,该字符可以是[]中指定的内容
 * 例如:
 * [abc]:这个字符可以是a或b或c
 * [a-z]:表示任意一个小写字母
 * [a-zA-Z]:表示任意一个字母
 * [a-zA-Z0-9_]:表示任意一个数字字母下划线
 * [^abc]:该字符只要不是a或b或c
 *
 * 预定义字符
 * .:"."表示任意一个字符,没有范围限制
 * \d:表示任意一个数字,等同于[0-9]
 * \w:表示任意一个单词字符,等同于[a-zA-Z0-9_]
 * \s:表示任意一个空白字符.
 * \D:表示不是数字
 * \W:不是单词字符
 * \S:不是空白字符
 *
 * 量词:
 * ?:表示前面的内容出现0-1次
 * 例如:
 * [abc]? 可以匹配:a 或 b 或 c 或什么也不写
 *
 * +:表示前面的内容出现1次以上
 * [abc]+ 可以匹配:aaaaaaaaaa...或abcabcbabcbabcbabcbabbabab....
 *        但是不能匹配:什么都不写或abcfdfsbbaqbb34bbwer...
 *
 * *:表示前面的内容出现任意次(0-多次)
 *   匹配内容与+一致,只是可以一次都不写.
 *
 * {n}:表示前面的内容出现n次
 * 例如:
 * [abc]{3} 可以匹配:aaa 或 bbb 或 aab
 *          不能匹配:aaaa或aad
 *
 * {n,m}:表示前面的内容出现最少n次最多m次
 * [abc]{3,5} 可以匹配:aaa 或  abcab 或者 abcc
 *            不能匹配:aaaaaa 或 aabbd
 *
 * {n,}:表示前面的内容出现n次以上(含n次)
 * [abc]{3,} 可以匹配:aaa 或 aaaaa.... 或 abcbabbcbabcbabcba....
 *           不能匹配:aa 或 abbdaw...
 *
 * ()用于分组,是将括号内的内容看做是一个整体
 * 例如:
 * (abc){3} 表示abc整体出现3次. 可以匹配abcabcabc.
 *          不能匹配aaa 或abcabc
 *
 * (abc|def){3}表示abc或def整体出现3次.
 *          可以匹配: abcabcabc 或 defdefdef 或 abcdefabc
 *
 * String支持正则表达式的方法之一:
 * boolean matches(String regex)
 * 使用给定的正则表达式验证当前字符串是否满足格式要求,满足则返回true.否则返回false
 */
public class MatchesDemo {
    public static void main(String[] args) {
         /*
            fancq@tedu.com.cn
            用户名@域名.后缀

            用户名:数字，字母，下划线。至少要有一个字符
            域名:字母，数字
            后缀:.字母组合

            email的正则表达式
            [a-zA-Z0-9_]+@[a-zA-Z0-9]+(\.[a-zA-Z]+)+
         */
        String mail = "fancq@tedu.cn";
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9]+(\\.[a-zA-Z]+)+";
        boolean match = mail.matches(regex);
        if(match){
            System.out.println("是邮箱");
        }else{
            System.out.println("不是邮箱");
        }
    }
}
