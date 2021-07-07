package lecture04;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ATM {
    List<Account> accountList;

    public ATM(){
        this.accountList = new ArrayList<>();
    }

    //# registerAccount (name:String, number:String):void
    //アカウントを登録する
    protected void registerAccount(String name,String number){
        //値を受け取って表示させるので入力は必要ない
        System.out.println("名前と口座番号を登録してください。");

        Account account = new Account(name, number);
        this.accountList.add(account);
        System.out.println(""+name+"　さんのアカウントを口座番号:"+number+"　で登録しました。");
    }

    //# existsAccount (name:String, number:String):boolean
    //引数のnameとnumberからaccountListに存在するかどうかをbooleanで返す
    protected boolean existsAccount(String name,String number){

        //拡張for文
        for(Account account: accountList) {
            if (account.getName().equals(name) && account.getNumber().equals(number)) {
                System.out.println("名前:" + name + "　口座番号:" + number + "　は存在します。");
                return true;
            }
        }
        System.out.println("名前:" + name + "　口座番号:" + number + "　は存在しません。");
        return false;
    }

    //# depost (number:String, money:long):void
    //引数のmoneyを利用して入金する
    protected void deposit(String number,long money) {
        for (Account account : accountList) {
            if(account.getNumber().equals(number)) {
                account.setBalance(account.getBalance() + money);
                System.out.println("口座番号:" + number + "　に　" + money + "　円入金しました。");
            }
        }
    }

    //# withdraw (number:String, money:long):long
    //引数のmoneyを利用してお金を引き出す
    protected long withdraw(String number,long money) {
        for (Account account : accountList) {
            if (account.getNumber().equals(number)) {
                long balance = account.getBalance();
                long newBalance = balance - money;

                if (newBalance < 0) {
                    //残高が足りない時は行えないようにする
                    System.out.println("口座番号:" + number + "　から　" + money + "　円引き出せませんでした。残高:" + balance + "　円です。");
                    return 0;
                } else {
                    account.setBalance(newBalance);
                    System.out.println("口座番号:" + number + "　から　" + money + "　円引き出しました。残高:" + newBalance + "　円です。");
                    return money;
                }
            }
        }
        return 0;
    }
}
