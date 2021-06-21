package lecture03;

import java.util.Scanner;

public class Exercise3_1 {
    public static void main(String[] args) { //mainメソッド
        System.out.println("任意の文字列を入力してください");

        Scanner scanner = new Scanner(System.in);
        //1行分の文字列入力を受け付ける
        String input = scanner.nextLine();

        System.out.println("”"+input+"”　と入力されました");
    }
}
