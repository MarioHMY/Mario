package homework;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * 随机生成四位数验证码
 */
public class RandomDemo {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P",
                "Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h",
                "i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
                "0","1","2","3","4","5","6","7","8","9"};
        StringBuilder yzm = new StringBuilder();
        Random random = new Random();

        for(int i=0;i<4;i++){
            int index = random.nextInt(arr.length);
            yzm.append(arr[index]);
        }
        System.out.println("生成的验证码为："+ yzm);
        /*
        System.out.println("请输入验证码:");
        Scanner scan = new Scanner(System.in);
        String inputCode = scan.nextLine();

        while (true){
            if(inputCode.toUpperCase().equals()){

            }


        }

         */
    }
}
