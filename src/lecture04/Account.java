package lecture04;

public class Account {
     private String name;
     private String number;
     private long balance;

     //# Account (name:String, number:String)
     public Account(String name, String number) {
          this.name = name;
          this.number = number;
          this.balance = 0;
     }

     //ゲッター
     public String getNumber() {
          return number;
     }

     public String getName() {
          return name;
     }

     //balanceのセッター、ゲッター
     //残高
     public void setBalance(long balance) {
          this.balance = balance;
     }
     public long getBalance() {
          return balance;
     }
}
