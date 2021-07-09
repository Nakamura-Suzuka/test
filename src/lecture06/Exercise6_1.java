package lecture06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //例外ハンドラ
        try{
            InputMismatchException fis = new InputMismatchException("input.err");
            System.out.println("小数値を入力してください");

            //入力した64bit浮動小数点値を返す
            double input = scanner.nextDouble();
            System.out.println("入力した値: "+input+"");
        }catch (InputMismatchException err){
            System.out.println("エラー");
        }
    }

}
