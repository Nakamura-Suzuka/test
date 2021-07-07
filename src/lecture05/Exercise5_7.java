package lecture05;

import java.util.ArrayList;

public class Exercise5_7 {
    public static void main(String[] args){
        //4つのインスタンスを末尾に追加する
        ArrayList<Insect> list = new ArrayList<>();
        list.add(new Insect()); //オブジェクトの生成
        list.add(new Butterfly());
        list.add(new Locust());
        list.add(new SwallowtailButterfly());

        //拡張for文
        for(Insect insects : list){
            insects.move();
        }
        //基本大文字はクラス名、小文字は変数名
    }
}
