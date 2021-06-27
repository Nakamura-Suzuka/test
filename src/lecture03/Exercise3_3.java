package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) { //main()メソッド
        Scanner scanner = new Scanner(System.in);

        System.out.println("1つめの整数を入力してください");
        //32bit整数値の入力の受付
        int input = scanner.nextInt();

        System.out.println("2つ目の整数を入力してください");
        int input2 = scanner.nextInt();

        int sum = input + input2;
        System.out.println(""+input+" + "+input2+" = "+sum+"");
    }
}
