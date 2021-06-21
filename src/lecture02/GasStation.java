package lecture02;

public class GasStation { //GasStationクラス
    public void refuel(Car car){ //refuelメソッド
        car.fuel =  car.fuel + 20; //.fuelを付けることにより、Carクラスのfuelを呼び出している
        System.out.println("給油したことによりfuelが20増えました。");
    }
}
