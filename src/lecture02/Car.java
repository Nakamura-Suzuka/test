package lecture02;

public class Car { //Carクラス
    int fuel; //変数 fuel
    Tire[] tires; //
    Engine engine;

    Car(){ //引数無し
        fuel = 0;
    }

    Car(Tire[] tires,Engine engine){ //コンストラクタを設定
        fuel = 0; //ここで初期化
        this.tires = tires;
        this.engine = engine;
    }

    public void run(){ //runメソッド
        if(fuel >= 1) {
            fuel = fuel - 1; //燃料を1消費する
            System.out.println("燃料を1消費して走りました");
        }
        else if(fuel <= 0) {
            System.out.println("燃料が足りないため走れませんでした。");
        }
    }

    public void startEngine(){
        engine.start();
    }
}
