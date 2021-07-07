package lecture04;

public class Exercise4_2 {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.existsAccount("中村鈴夏","10000");
        atm.registerAccount("中村鈴夏","10000");

        if(atm.existsAccount("中村鈴夏","10000")){
            atm.deposit("10000",1000); //1000円入れた
            atm.withdraw("10000",2000); //2000円引き出す

            atm.withdraw("10000",500); //500円引き出す
        }
    }
}
