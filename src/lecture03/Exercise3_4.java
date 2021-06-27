package lecture03;

import java.util.ArrayList;

public class Exercise3_4 {
    public static void main(String[] args) { //main()メソッド
        //型引数がVegetable型のArrayList
        ArrayList<Vegetable> arrayList = new ArrayList<>();

        //Vegetableクラスのインスタンス化とその際に引数を渡す
        /*
        Vegetable vegetable1 = new Vegetable("にんじん",117);
        Vegetable vegetable2 = new Vegetable("たまねぎ",120);
        Vegetable vegetable3 = new Vegetable("じゃがいも",154);
        */

        //繰り返し処理を用いた場合
        for(Vegetable str : arrayList){

        }

        //Vegetableクラスのインスタンスからprint()メソッドを呼び出す
        Vegetable.print();
    }
}