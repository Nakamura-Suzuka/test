package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) { //mainメソッド
        //インスタンス化
        Car car = new Car();
        GasStation gasStation = new GasStation();

        car.run(); //Carクラスのrunメソッドを呼び出す
        gasStation.refuel(car); //GasStationクラスのrefuelメソッドを呼び出す
        car.run();
    }
}
