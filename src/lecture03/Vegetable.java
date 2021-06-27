package lecture03;

public class Vegetable { //Vegetableクラス
    String name; //野菜の名前を格納するためのString型のname
    int value; //値段を格納するためのint型value

    //コンストラクタ
    Vegetable(String name , int value){
        this name = name;
        this value = value;
    }

    public static void print() { //print()メソッド
        System.out.println(""+name+"　は　"+value+"円");
    }
}