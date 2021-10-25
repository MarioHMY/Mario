package homework;

import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static String getRandomString(){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<4;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String yzm = getRandomString();
        System.out.println(yzm);
        System.out.println("请输入验证码:");
        Scanner scan = new Scanner(System.in);
        String inputCode = scan.nextLine();

        while (true){
            if(inputCode.toUpperCase().equals(yzm.toUpperCase())){
                break;
            }else{
                System.out.println("输入错误");
                yzm = getRandomString();
                System.out.println(yzm);
                System.out.println("请输入验证码:");
                scan = new Scanner(System.in);
                inputCode = scan.nextLine();
            }
        }
        System.out.println("验证码正确！");
    }
}
