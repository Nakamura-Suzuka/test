package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4]; //Tire型の配列tires

        for(int i = 0;i <= 3;i++){
            //Tire型の配列tiresをインスタンス化、sizeに65を配列に格納していく
            tires[i] = new Tire(65);
        }

        Engine engine = new Engine(4000); //Engine型のengineをインスタンス化
        Car car = new Car(tires,engine); //Car型のcarをインスタンス化
        GasStation gasStation = new GasStation(); //GasStation型のgasStationをインスタンス化

        gasStation.refuel(car); //refuel()でcarに給油する
        car.startEngine(); //呼び出す
        car.run(); //呼び出す
    }
}
