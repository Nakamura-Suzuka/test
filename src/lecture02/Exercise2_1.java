package lecture02;

public class Exercise2_1 {
    //インスタンスの作成
    public static void main(String[] args) { //mainメソッド
        //インスタンス化
        //インスタンス化の時に引数を渡すことで、
        //「name」を「たかし」に、「age」を「18」に指定できる
        Human sumple1 = new Human("たかし", 18);
        Human sumple2 = new Human("ひろし", 20);

        sumple1.print(); //mainメソッド内にplintメソッドを呼び出す
        sumple2.print();
    }
}