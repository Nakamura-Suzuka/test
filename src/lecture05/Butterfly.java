package lecture05;

public class Butterfly extends Insect{ //Insectクラスを継承
    @Override //親クラスのメソッドを再定義(上書き)

    //Butterflyのmoveメソッド
    public void move(){
        System.out.println("飛んだよ");
    }
}
