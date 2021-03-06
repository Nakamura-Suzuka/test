package lecture03;

import java.util.ArrayList;
import java.util.Scanner; //Scannerを使うという宣言

public class Exercise3_2 {
    public static void main(String[] args) { //main()メソッド
        //Scannerをインスタンス化
        Scanner scanner = new Scanner(System.in);
        //何行分の文字列を入力させるかを入力させる
        System.out.println("何行分入力しますか？");
        //入力された1行分の文字列を読み取って返す
        int input = scanner.nextInt();
        scanner.nextLine();

        //指定された行数分入力を受け付け、それらの文字列をArrayListに追加する
        ArrayList<String> arrayList = new ArrayList<String>();
        for(int i = 0;i < input; i++){
            String input2 = scanner.nextLine();
            arrayList.add(input2); //arrayListのadd(input2)メソッド
        }

        //拡張for文
        for(String str : arrayList){
            int x;
            x = arrayList.indexOf(str); //indexOf(str)メソッド
            System.out.println("["+x+"]" + str);
        }
    }
}

//+arrayList.indexOf(str) "行目:"
