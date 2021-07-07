package lecture05;

public class Locust extends Insect { //Insectクラスを継承
    @Override //親クラスのメソッドを再定義(上書き)

    //Locustのmoveメソッド
    public void move(){
        System.out.println("跳んだよ");
    }
}
