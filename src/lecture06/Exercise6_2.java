package lecture06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        //Randomクラスからint nextInt(int max)メソッドを呼び出す
        java.util.Random random = new java.util.Random();
        System.out.println(random.nextInt(100)); //0~99の値を表示

        //1~6のランダムな値を持つIntegerクラスのインスタンスを5個追加する
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(new ArrayList);
        for(int i = 0 ; i < 4 ; i++){
        }
        System.out.println("さいころを"+arrayList+"個振りました");

        System.out.println("何番目のさいころを確認しますか？");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

    }
}
